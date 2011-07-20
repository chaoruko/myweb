package com.hoge.myweb.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.util.LabelValueBean;
import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

import com.hoge.myweb.entity.Person;

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

    public List<LabelValueBean> getLevels() {
        List<LabelValueBean> levels = new ArrayList<LabelValueBean>();
        levels.add(new LabelValueBean("normal", Person.LEVEL_DEFAULT.toString()));
        levels.add(new LabelValueBean("admin", Person.LEVEL_ADMIN.toString()));
        return levels;
    }
}
