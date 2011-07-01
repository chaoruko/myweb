package com.hoge.myweb.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.MailSendHistory;
import com.hoge.myweb.service.MailSendHistoryService;

public class MailHistoriesAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    protected MailSendHistoryService mailSendHistoryService;

    public List<MailSendHistory> histories;

    @Execute(validator = false)
    public String index() {
        histories = mailSendHistoryService.findAllOrderById();
        return indexJsp;
    }

}
