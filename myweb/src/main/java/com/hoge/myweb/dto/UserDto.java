package com.hoge.myweb.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public Integer id;

    public String code;

    public String name;

    public Boolean admin;

}
