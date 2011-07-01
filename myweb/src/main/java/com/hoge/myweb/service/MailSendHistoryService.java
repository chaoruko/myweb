package com.hoge.myweb.service;

import com.hoge.myweb.entity.MailSendHistory;
import java.util.List;
import javax.annotation.Generated;

import static com.hoge.myweb.names.MailSendHistoryNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MailSendHistory}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2011/06/28 15:39:54")
public class MailSendHistoryService extends AbstractService<MailSendHistory> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public MailSendHistory findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MailSendHistory> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}