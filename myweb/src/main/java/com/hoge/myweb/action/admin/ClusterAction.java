package com.hoge.myweb.action.admin;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.Cluster;
import com.hoge.myweb.form.ClusterForm;
import com.hoge.myweb.service.ClusterService;

public class ClusterAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    public final static String editJsp = "edit.jsp";

    @Resource
    protected ClusterService clusterService;

    @ActionForm
    @Resource(name = "clusterForm")
    protected ClusterForm form;

    public List<Cluster> clusters;

    @Execute(validator = false)
    public String hello() {
        Map<String, Object> json = new HashMap<String, Object>();
        json.put("author", "Goldratt & Fox");
        json.put("title", "The Race");
        writeJSON(json);
        return null;
    }

    @Execute(validator = false)
    public String index() {
        clusters = clusterService.findAllOrderById();
        return indexJsp;
    }

    @Execute(validator = false)
    public String edit() {

        Cluster entity = clusterService.findById(form.id);
        BeanUtil.copyProperties(entity, form);

        return editJsp;
    }

    @Execute(validator = false)
    public String create() {

        return editJsp;
    }

    @Execute(validator = true, input = editJsp)
    public String save() {

        Cluster cluster = null;
        if (form.id != null && form.id > 0) {
            cluster = clusterService.findById(form.id);
            BeanUtil.copyProperties(form, cluster);

            cluster.updatedAt = new Date();
            cluster.updatedPersonId = userDto.id;
            clusterService.update(cluster);
            addMessage("message.updated");

        } else {
            cluster = new Cluster();
            BeanUtil.copyProperties(form, cluster);

            Date dt = new Date();
            cluster.createdAt = dt;
            cluster.createdPersonId = userDto.id;
            cluster.updatedAt = dt;
            cluster.updatedPersonId = userDto.id;
            clusterService.insert(cluster);

            addMessage("message.saved");
        }

        return index();
    }
}
