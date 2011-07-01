package com.hoge.myweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Cluster extends AbstractEntity {

    @Column(unique = true)
    public String code;

    public String name;

    @Lob
    public String description;

    @OneToMany(mappedBy = "cluster")
    public List<Member> members;

}
