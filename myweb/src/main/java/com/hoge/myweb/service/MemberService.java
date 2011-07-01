package com.hoge.myweb.service;

import com.hoge.myweb.entity.Member;
import java.util.List;
import javax.annotation.Generated;

import static com.hoge.myweb.names.MemberNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Member}のサービスクラスです。
 * 
 */
@Generated(value = { "S2JDBC-Gen 2.4.43",
        "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2011/06/23 14:33:36")
public class MemberService extends AbstractService<Member> {

    public List<Member> findAllByPersonIdWithPerson(Integer personId) {
        return select().orderBy(asc(id())).leftOuterJoin(person())
                .where("person_id=?", personId).getResultList();
    }

    public List<Member> findAllByClusterIdWithCluster(Integer clusterId) {
        return select().orderBy(asc(id())).leftOuterJoin(cluster())
                .where("cluster_id=?", clusterId).getResultList();
    }

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Member findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Member> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}