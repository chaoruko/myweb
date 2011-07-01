package com.hoge.myweb.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Article extends AbstractEntity {

    public Integer boardId;

    public String title;

    @Lob
    public String bodyText;

    @ManyToOne
    public Board board;

    @OneToMany(mappedBy = "article")
    public List<Comment> comments;

}
