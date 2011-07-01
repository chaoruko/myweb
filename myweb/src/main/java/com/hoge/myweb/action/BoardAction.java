package com.hoge.myweb.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

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

}
