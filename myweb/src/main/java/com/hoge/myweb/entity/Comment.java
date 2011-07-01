package com.hoge.myweb.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comment extends AbstractEntity {

    public Integer articleId;

    public String title;

    @Lob
    public String bodyText;

    @ManyToOne
    public Article article;
}
