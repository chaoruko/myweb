package com.hoge.myweb.service;

import com.hoge.myweb.entity.Cluster;
import java.util.List;
import javax.annotation.Generated;

import static com.hoge.myweb.names.ClusterNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Cluster}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2011/06/23 14:33:36")
public class ClusterService extends AbstractService<Cluster> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Cluster findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Cluster> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}