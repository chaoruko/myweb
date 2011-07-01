package com.hoge.myweb.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public Integer createdPersonId;

    public Integer updatedPersonId;

    @ManyToOne
    public Person createdPerson;

    @ManyToOne
    public Person updatedPerson;

    @Temporal(TemporalType.TIMESTAMP)
    public Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    public Date updatedAt;

}
