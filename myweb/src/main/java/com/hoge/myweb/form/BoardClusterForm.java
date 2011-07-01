package com.hoge.myweb.form;

import org.seasar.struts.annotation.IntegerType;

public class BoardClusterForm extends BaseForm {

    @IntegerType
    public Integer id;

    @IntegerType
    public Integer boardId;

    @IntegerType
    public Integer clusterId;

}
