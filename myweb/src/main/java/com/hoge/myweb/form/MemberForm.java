package com.hoge.myweb.form;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.IntegerType;

import com.hoge.myweb.entity.Person;
import com.hoge.myweb.service.PersonService;

public class MemberForm extends BaseForm {

    @IntegerType
    public Integer id;

    @IntegerType
    public Integer personId;

    @IntegerType
    public Integer clusterId;

    /*
    @Resource
    public PersonService personService;

    public List<Person> getPersons() {
        List<Person> persons = personService.findAll();
        return persons;
    }
    */
}
