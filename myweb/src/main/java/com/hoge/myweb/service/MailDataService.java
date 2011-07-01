package com.hoge.myweb.service;

import com.hoge.myweb.entity.MailData;
import java.util.List;
import javax.annotation.Generated;

import static com.hoge.myweb.names.MailDataNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MailData}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2011/06/28 15:39:54")
public class MailDataService extends AbstractService<MailData> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public MailData findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MailData> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}