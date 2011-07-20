package com.hoge.myweb.action.admin;

import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;

public class MenuAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Execute(validator = false)
    public String index() {
        return indexJsp;
    }

}
