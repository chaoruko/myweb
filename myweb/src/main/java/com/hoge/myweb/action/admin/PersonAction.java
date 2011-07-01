package com.hoge.myweb.action.admin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts.util.LabelValueBean;
import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.Person;
import com.hoge.myweb.form.PersonForm;
import com.hoge.myweb.service.PersonService;

public class PersonAction extends BaseAction {

    public final static String indexJsp = "index.jsp";
    public final static String editJsp = "edit.jsp";

    @Resource
    protected PersonService personService;

    @ActionForm
    @Resource(name = "personForm")
    protected PersonForm form;

    public List<Person> persons;

    public List<LabelValueBean> levels;

    @Execute(validator = false)
    public String index() {
        persons = personService.findAllOrderById();
        return indexJsp;
    }

    @Execute(validator = false)
    public String edit() {

        Person person = personService.findById(form.id);
        BeanUtil.copyProperties(person, form);

        createOpts();

        return editJsp;
    }

    private void createOpts() {
        levels = new ArrayList<LabelValueBean>();
        levels.add(new LabelValueBean("normal", Person.LEVEL_DEFAULT.toString()));
        levels.add(new LabelValueBean("admin", Person.LEVEL_ADMIN.toString()));
    }

    @Execute(validator = false)
    public String create() {
        createOpts();
        return editJsp;
    }

    @Execute(validator = true, input = editJsp)
    public String save() {

        Person person = null;
        if (form.id != null && form.id > 0) {
            person = personService.findById(form.id);
            BeanUtil.copyProperties(form, person);

            person.updatedAt = new Date();
            person.updatedPersonId = userDto.id;
            personService.update(person);
            addMessage("message.updated");

        } else {
            person = new Person();
            BeanUtil.copyProperties(form, person);

            Date dt = new Date();
            person.createdAt = dt;
            person.createdPersonId = userDto.id;
            person.updatedAt = dt;
            person.updatedPersonId = userDto.id;
            personService.insert(person);

            addMessage("message.saved");
        }

        return index();
    }
}
