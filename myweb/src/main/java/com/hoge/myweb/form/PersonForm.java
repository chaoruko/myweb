package com.hoge.myweb.form;

import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class PersonForm extends BaseForm {

    @IntegerType
    public Integer id;

    public String firstName;

    public String lastName;

    @Required
    public String code;

    @Required
    public String name;

    public Integer level;

    @EmailType
    public String mailAddress;

    @Required
    public String password;

}
