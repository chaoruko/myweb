package com.hoge.myweb.action;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.arnx.jsonic.JSON;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.exception.IORuntimeException;
import org.seasar.struts.util.ActionMessagesUtil;
import org.seasar.struts.util.RequestUtil;
import org.seasar.struts.util.ResponseUtil;

import com.hoge.myweb.dto.UserDto;

public abstract class BaseAction {

    public static String loginPath = "/login?redirect=true";

//    @Resource
//    protected HttpServletRequest request;

//    @Resource
//    protected HttpServletResponse response;

    @Resource
    public UserDto userDto;

    public boolean isLoggedIn() {
        return (userDto != null && userDto.code != null && userDto.code
                .length() > 0);
    }

    public boolean isAdmin() {
        return isLoggedIn() && userDto.admin;
    }

    protected void addMessage(String key) {
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(key));
        ActionMessagesUtil.addMessages(RequestUtil.getRequest(), messages);
    }

    /** JSONのエンコーディング */
    public static final String JSON_ENCODING = "UTF-8";

    /** JSONのコンテントタイプ */
    public static final String JSON_CONTENT_TYPE = "application/json";

    /**
     * JSONをレスポンスに書き出します。
     * @param source 書き出すオブジェクト
     * @param prettyPrint 出力を整形するか
     */
    public void writeJSON(Object source) {
        writeJSON(source, false, JSON_CONTENT_TYPE, null);
    }

    /**
     * JSONをレスポンスに書き出します。
     * @param source 書き出すオブジェクト
     * @param prettyPrint 出力を整形するか
     */
    public void writeJSON(Object source, boolean prettyPrint) {
        writeJSON(source, prettyPrint, JSON_CONTENT_TYPE, null);
    }

    /**
     * JSONをレスポンスに書き出します。
     * @param source 書き出すオブジェクト
     * @param prettyPrint 出力を整形するか
     * @param contentType コンテントタイプ
     */
    public void writeJSON(Object source, boolean prettyPrint, String contentType) {
        writeJSON(source, prettyPrint, contentType, null);
    }

    /**
     * JSONをレスポンスに書き出します。
     * @param source
     *            書き出すオブジェクト
     * @param prettyPrint
     *            出力を整形するか
     * @param contentType
     *            コンテントタイプ。 デフォルトはapplication/context。
     * @param encoding
     *            エンコーディング。 指定しなかった場合は、リクエストのcharsetEncodingが設定される。
     *            リクエストのcharsetEncodingも指定がない場合は、UTF-8。
     */
    public void writeJSON(Object source, boolean prettyPrint,
            String contentType, String encoding) {
        if (contentType == null) {
            contentType = JSON_CONTENT_TYPE;
        }
        if (encoding == null) {
            encoding = RequestUtil.getRequest().getCharacterEncoding();
            if (encoding == null) {
                encoding = JSON_ENCODING;
            }
        }
        HttpServletResponse response = ResponseUtil.getResponse();
        response.setContentType(contentType + "; charset=" + encoding);
        try {
            Writer out = new OutputStreamWriter(response.getOutputStream(),
                    encoding);
            try {
                JSON.encode(source, out, prettyPrint);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }
}
