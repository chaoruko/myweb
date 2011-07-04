package com.hoge.myweb.action.admin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import net.arnx.jsonic.JSON;

import org.apache.struts.util.LabelValueBean;
import org.seasar.framework.beans.util.BeanMap;
import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import com.hoge.myweb.action.BaseAction;
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

    public Board board;

    @Execute(validator = false)
    public String index() {
        boards = boardService.findAllWith();
        return indexJsp;
    }

    @Execute(validator = false)
    public String edit() {
        if (!isAdmin()) {
            return index();
        }
        Board board = boardService.findById(form.id);
        BeanUtil.copyProperties(board, form);

        return create();
    }

    /**
     * 入力形式の選択肢
     * @return
     */
    @Execute(validator = false)
    public String optionsEntryOpts() {
        List<LabelValueBean> entryTypes = new ArrayList<LabelValueBean>();
        entryTypes
                .add(new LabelValueBean("Board", Board.ENTRY_BOARD.toString()));
        entryTypes.add(new LabelValueBean("Blog", Board.ENTRY_BLOG.toString()));

        BeanMap map = new BeanMap();
        map.put("list", entryTypes);
        ResponseUtil.write(JSON.encode(map), "application/json");
        return null;
    }

    @Execute(validator = false)
    public String create() {
        if (!isAdmin()) {
            return index();
        }

        return editJsp;
    }

    @Execute(validator = true, input = editJsp)
    public String save() {
        if (!isAdmin()) {
            return index();
        }

        Board board = null;
        if (form.id != null && form.id > 0) {
            board = boardService.findById(form.id);
            BeanUtil.copyProperties(form, board);

            board.updatedAt = new Date();
            board.updatedPersonId = userDto.id;

            boardService.update(board);

            addMessage("message.updated");

        } else {
            board = new Board();
            BeanUtil.copyProperties(form, board);

            Date dt = new Date();
            board.createdAt = dt;
            board.createdPersonId = userDto.id;
            board.updatedAt = dt;
            board.updatedPersonId = userDto.id;
            boardService.insert(board);

            addMessage("message.saved");
        }

        return index();
    }

}
