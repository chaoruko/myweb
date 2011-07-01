package com.hoge.myweb.form;

import org.seasar.struts.annotation.Required;

public class LoginForm extends BaseForm{

    @Required
    public String userId;
    
    @Required
    public String password;
    
}
