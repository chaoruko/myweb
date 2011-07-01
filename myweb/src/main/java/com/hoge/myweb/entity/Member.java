package com.hoge.myweb.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "person_id",
        "cluster_id" }))
public class Member extends AbstractEntity {

    public Integer personId;

    public Integer clusterId;

    @ManyToOne
    public Person person;

    @ManyToOne
    public Cluster cluster;
    
    
}
