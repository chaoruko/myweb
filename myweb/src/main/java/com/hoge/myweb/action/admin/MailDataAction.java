package com.hoge.myweb.action.admin;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.MailData;
import com.hoge.myweb.entity.MailSendHistory;
import com.hoge.myweb.form.MailDataForm;
import com.hoge.myweb.service.MailDataService;
import com.hoge.myweb.service.MailSendHistoryService;

public class MailDataAction extends BaseAction {

    public final static String indexJsp = "index.jsp";
    public final static String editJsp = "edit.jsp";

    @Resource
    protected MailDataService mailDataService;
    @Resource
    protected MailSendHistoryService mailSendHistoryService;

    @ActionForm
    @Resource(name = "mailDataForm")
    protected MailDataForm form;

    public List<MailData> mailDatas;

    @Resource(name = "multiPartEmail")
    public MultiPartEmail email;

    @Execute(validator = false)
    public String index() {
        mailDatas = mailDataService.findAllOrderById();
        return indexJsp;
    }

    @Execute(validator = false)
    public String edit() {

        MailData mdata = mailDataService.findById(form.id);
        BeanUtil.copyProperties(mdata, form);

        return editJsp;
    }

    @Execute(validator = false)
    public String create() {
        return editJsp;
    }

    @Execute(validator = false)
    public String send() {
        MailData mdata = mailDataService.findById(form.id);

        String fromAddress = "kaoruko.hiyoshi@aifront.co.jp";
        String toAddress = "kaoruko.hiyoshi@aifront.co.jp";

        try {
            email.addTo(fromAddress, "ひよとぅ");
            email.setFrom(toAddress, "ひよふろむ");
            email.setSubject(mdata.subject);
            //            email.setContent(mdata.bodyText, "text/plain; charset=ISO-2022-JP");
            email.setMsg(mdata.bodyText);
            //            email.setCharset("ISO-2022-JP");
            email.send();
            
            addMessage("message.sent");

            MailSendHistory history = new MailSendHistory();
            history.mailDataId = mdata.id;
            history.subject = mdata.subject;
            history.bodyText = mdata.bodyText;
            history.fromAddress = fromAddress;
            history.toAddress = toAddress;
            Date dt = new Date();
            history.createdAt = dt;
            history.createdPersonId = userDto.id;

            mailSendHistoryService.insert(history);

        } catch (EmailException e) {
            e.printStackTrace();
        }

        return index();
    }

    @Execute(validator = true, input = editJsp)
    public String save() {
        MailData mdata = null;
        if (form.id != null && form.id > 0) {
            mdata = mailDataService.findById(form.id);
            BeanUtil.copyProperties(form, mdata);

            mdata.updatedAt = new Date();
            mdata.updatedPersonId = userDto.id;
            mailDataService.update(mdata);
            addMessage("message.updated");

        } else {
            mdata = new MailData();
            BeanUtil.copyProperties(form, mdata);

            Date dt = new Date();
            mdata.createdAt = dt;
            mdata.createdPersonId = userDto.id;
            mdata.updatedAt = dt;
            mdata.updatedPersonId = userDto.id;
            mailDataService.insert(mdata);

            addMessage("message.saved");
        }

        return index();
    }
}
