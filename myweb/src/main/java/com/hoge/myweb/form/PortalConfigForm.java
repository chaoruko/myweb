package com.hoge.myweb.form;

import org.seasar.struts.annotation.IntegerType;

public class PortalConfigForm extends BaseForm {

    @IntegerType
    public Integer id;

    public String key;

    public Integer keyId;

}
