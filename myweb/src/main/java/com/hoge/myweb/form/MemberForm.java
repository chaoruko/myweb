package com.hoge.myweb.form;

import org.seasar.struts.annotation.IntegerType;

public class MemberForm extends BaseForm {

    @IntegerType
    public Integer id;

    @IntegerType
    public Integer personId;

    @IntegerType
    public Integer clusterId;

}
