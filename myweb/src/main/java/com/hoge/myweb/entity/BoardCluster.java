package com.hoge.myweb.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * どのボードはどのクラスタのものか
 * 
 * @author hiyoshi
 *
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "board_id",
        "cluster_id" }))
public class BoardCluster extends AbstractEntity {

    public Integer boardId;

    public Integer clusterId;

    @ManyToOne
    public Board board;

    @ManyToOne
    public Cluster cluster;

}
