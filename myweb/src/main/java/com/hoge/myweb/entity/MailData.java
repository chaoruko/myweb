package com.hoge.myweb.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class MailData extends AbstractEntity {

    public String subject;

    @Lob
    public String bodyText;

    @Lob
    public String comment;

    public Integer numberSent;

}
