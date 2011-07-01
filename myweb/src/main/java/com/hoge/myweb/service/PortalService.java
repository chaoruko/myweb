package com.hoge.myweb.service;

import com.hoge.myweb.entity.Portal;
import java.util.List;
import javax.annotation.Generated;

import static com.hoge.myweb.names.PortalNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Portal}のサービスクラスです。
 * 
 */
@Generated(value = { "S2JDBC-Gen 2.4.43",
        "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2011/06/23 13:28:11")
public class PortalService extends AbstractService<Portal> {

    public List<Portal> findByKey(String key) {
        return select().orderBy(asc(id())).where("key = ? ", key)
                .getResultList();
    }

    public List<Portal> findInfo() {
        return select().orderBy(asc(id())).where("key = ? ", Portal.KEY_INFO)
                .getResultList();

    }

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Portal findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Portal> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}