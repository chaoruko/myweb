package com.hoge.myweb.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class MailDataForm extends BaseForm {

    @IntegerType
    public Integer id;

    @Required
    public String subject;

    @Required
    public String bodyText;


}
