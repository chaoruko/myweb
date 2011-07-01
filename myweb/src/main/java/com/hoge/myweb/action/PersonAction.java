package com.hoge.myweb.action;

import java.util.List;

import javax.annotation.Resource;

import net.arnx.jsonic.JSON;

import org.seasar.framework.beans.util.BeanMap;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import com.hoge.myweb.entity.Person;
import com.hoge.myweb.service.PersonService;

public class PersonAction extends BaseAction {

    @Resource
    protected PersonService personService;

    @Execute(validator = false)
    public String list() {
        List<Person> list = personService.findAllOrderById();
        BeanMap map = new BeanMap();
        map.put("list", list);
        ResponseUtil.write(JSON.encode(map), "application/json");
        return null;
    }

}
