package com.hoge.myweb.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class BoardForm extends BaseForm{
    
    @IntegerType
    public Integer id;
    
    @Required
    public String name;

    public String description;

    @Required
    public Integer adminPersonId;
    
    @Required
    public Integer entryType;
    
    public Integer clusterId;

}
