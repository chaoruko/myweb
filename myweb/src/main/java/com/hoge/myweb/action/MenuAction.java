package com.hoge.myweb.action;

import org.seasar.struts.annotation.Execute;

public class MenuAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Execute(validator = false)
    public String index() {
        return indexJsp;
    }

}
