package com.hoge.myweb.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class ClusterForm extends BaseForm {

    @IntegerType
    public Integer id;

    @Required
    public String code;

    @Required
    public String name;

}
