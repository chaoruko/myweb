package com.hoge.myweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Person extends AbstractEntity {

    public final static Integer LEVEL_DEFAULT = 0;
    public final static Integer LEVEL_ADMIN = 7;

    @Column(unique = true)
    public String code;

    public String name;

    public String mailAddress;

    public String password;

    @Column(columnDefinition = "default 0")
    public Integer level;


    public boolean isAdmin() {
        return (level != null && level >= LEVEL_ADMIN);
    }
}
