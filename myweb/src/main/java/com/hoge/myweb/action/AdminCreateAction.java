package com.hoge.myweb.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.entity.Person;
import com.hoge.myweb.form.LoginForm;
import com.hoge.myweb.service.PersonService;

public class AdminCreateAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    protected PersonService personService;

    @ActionForm
    @Resource(name = "loginForm")
    protected LoginForm form;

    public boolean hasAdmins;

    @Execute(validator = false)
    public String index() {
        hasAdmins = false;
        List<Person> admins = personService.findByLevel(Person.LEVEL_ADMIN);
        if (admins != null && admins.size() > 0) {
            addMessage("errors.admin.exists");
            hasAdmins = true;
        }

        return indexJsp;
    }

    @Execute(validator = true, input = indexJsp)
    public String create() {

        Person p = personService.findByCode(form.userId);
        if (p != null) {
            addMessage("errors.admin.create");
            return indexJsp;
        }

        Person person = new Person();
        person.code = form.userId;
        person.name = form.userId;
        person.password = form.password;

        Date date = new Date();
        person.createdAt = date;
        person.updatedAt = date;
        person.level = Person.LEVEL_ADMIN;

        personService.insert(person);

        return loginPath;
    }

}
