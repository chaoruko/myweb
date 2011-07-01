package com.hoge.myweb.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;

import com.sun.istack.internal.NotNull;

@Entity
public class MailSendHistory extends AbstractEntity {

    @NotNull
    public Integer mailDataId;

    public String fromAddress;

    public String toAddress;

    public String subject;

    @Lob
    public String bodyText;

    @Lob
    public String comment;

}
