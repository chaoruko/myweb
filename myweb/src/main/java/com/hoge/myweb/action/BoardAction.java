package com.hoge.myweb.action;

import java.util.List;

import javax.annotation.Resource;

import net.arnx.jsonic.JSON;

import org.seasar.framework.beans.util.BeanMap;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import com.hoge.myweb.entity.Board;
import com.hoge.myweb.form.BoardForm;
import com.hoge.myweb.service.BoardService;
import com.hoge.myweb.service.PersonService;

public class BoardAction extends BaseAction {

    public final static String indexJsp = "index.jsp";
    public final static String editJsp = "edit.jsp";

    @Resource
    protected BoardService boardService;

    @Resource
    protected PersonService personService;

    @ActionForm
    @Resource(name = "boardForm")
    protected BoardForm form;

    public List<Board> boards;

    @Execute(validator = false)
    public String index() {
        boards = boardService.findAllBoardsWithAdmin();
        return indexJsp;
    }

    @Execute(validator = false)
    public String boards() {
        List<Board> list = boardService.findAllBoardsWithAdmin();
        BeanMap map = new BeanMap();
        map.put("list", list);
        ResponseUtil.write(JSON.encode(map), "application/json");
        return null;
    }
}
