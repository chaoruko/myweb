package com.hoge.myweb.form;

import org.seasar.struts.annotation.IntegerType;

public abstract class BaseForm {

    public String backPath;

    @IntegerType
    public String pageNum;

}
