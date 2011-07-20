package com.hoge.myweb.action.admin;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.Cluster;
import com.hoge.myweb.entity.Member;
import com.hoge.myweb.form.MemberForm;
import com.hoge.myweb.service.ClusterService;
import com.hoge.myweb.service.MemberService;

public class ClusterMemberAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    public ClusterService clusterService;

    @Resource
    public MemberService memberService;

    @ActionForm
    @Resource(name = "memberForm")
    public MemberForm form;

    /** グループ */
    public Cluster cluster;

    /** あるグループのメンバー */
    public List<Member> members;

    @Execute(validator = false)
    public String index() {
        members = memberService.findAllByClusterIdWith(form.clusterId);
        cluster = clusterService.findById(form.clusterId);
        return indexJsp;
    }

    @Execute(validator = false)
    public String edit() {
        Member entity = memberService.findById(form.id);
        BeanUtil.copyProperties(entity, form);
        return index();
    }

    @Execute(validator = true, input = indexJsp)
    public String save() {

        Member entity = null;
        if (form.id != null && form.id > 0) {
            entity = memberService.findById(form.id);
            BeanUtil.copyProperties(form, entity);

            entity.updatedAt = new Date();
            entity.updatedPersonId = userDto.id;
            memberService.update(entity);
            addMessage("message.updated");

        } else {
            entity = new Member();
            BeanUtil.copyProperties(form, entity);

            Date dt = new Date();
            entity.createdAt = dt;
            entity.createdPersonId = userDto.id;
            entity.updatedAt = dt;
            entity.updatedPersonId = userDto.id;
            memberService.insert(entity);

            addMessage("message.saved");
        }

        return index();
    }
}
