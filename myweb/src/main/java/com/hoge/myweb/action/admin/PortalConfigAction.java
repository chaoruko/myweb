package com.hoge.myweb.action.admin;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.Portal;
import com.hoge.myweb.form.PortalConfigForm;
import com.hoge.myweb.service.PortalService;

public class PortalConfigAction extends BaseAction {

    public final static String indexJsp = "index.jsp";
    public final static String editJsp = "edit.jsp";

    @Resource
    protected HttpServletRequest request;

    @Resource
    protected PortalService portalService;

    @ActionForm
    @Resource(name = "portalConfigForm")
    protected PortalConfigForm form;

    public List<Portal> portals;

    @Execute(validator = false)
    public String index() {
        portals = portalService.findAllOrderById();
        return indexJsp;
    }

    @Execute(validator = false)
    public String edit() {

        Portal entity = portalService.findById(form.id);
        BeanUtil.copyProperties(entity, form);

        return editJsp;
    }

    @Execute(validator = false)
    public String create() {
        return editJsp;
    }

    @Execute(validator = true, input = editJsp)
    public String save() {

        Portal entity = null;
        if (form.id != null && form.id > 0) {
            entity = portalService.findById(form.id);
            BeanUtil.copyProperties(form, entity);

            entity.updatedAt = new Date();
            entity.updatedPersonId = userDto.id;
            portalService.update(entity);
            addMessage("message.updated");
        } else {
            entity = new Portal();
            BeanUtil.copyProperties(form, entity);

            Date dt = new Date();
            entity.createdAt = dt;
            entity.createdPersonId = userDto.id;
            entity.updatedAt = dt;
            entity.updatedPersonId = userDto.id;
            portalService.insert(entity);
            addMessage("message.saved");
        }

        return index();
    }
}
