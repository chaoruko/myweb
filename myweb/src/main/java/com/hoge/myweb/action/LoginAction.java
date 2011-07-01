package com.hoge.myweb.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.dto.UserDto;
import com.hoge.myweb.entity.Person;
import com.hoge.myweb.form.LoginForm;
import com.hoge.myweb.service.PersonService;

public class LoginAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    protected UserDto userDto;

    @Resource
    protected PersonService personService;

    @ActionForm
    @Resource(name = "loginForm")
    protected LoginForm form;

    @Execute(validator = false)
    public String index() {
        return indexJsp;
    }

    @Execute(validator = true, input = indexJsp)
    public String login() {

        Person person = personService.findByCode(form.userId);
        if (person != null) {
            if (form.password.equals(person.password)) {
                // メニューへ

                userDto.id = person.id;
                userDto.code = person.code;
                userDto.admin = person.isAdmin();

                return "/menu?redirect=true";
            }
        }

        return indexJsp;
    }

}
