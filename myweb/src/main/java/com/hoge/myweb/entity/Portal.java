package com.hoge.myweb.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Portal extends AbstractEntity {

    public static String KEY_INFO = "info";

    public String key;

    public Integer keyId;

    @Lob
    public String description;

}
