package com.hoge.myweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Board extends AbstractEntity {

    public final static Integer ENTRY_BOARD = 0;
    public final static Integer ENTRY_BLOG = 1;
    public final static Integer ENTRY_MESSAGE_BOX = 2;

    public String name;

    @Lob
    public String description;

    @Column(nullable = false)
    public Integer adminPersonId;

    @ManyToOne
    public Person adminPerson;

    @OneToMany(mappedBy = "board")
    public List<Article> articles;

    @Column(columnDefinition = "default 0")
    public Integer entryType;

    @OneToMany(mappedBy = "board")
    public List<BoardCluster> boardClusters;
}
