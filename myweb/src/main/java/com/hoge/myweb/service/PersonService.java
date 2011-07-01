package com.hoge.myweb.service;

import com.hoge.myweb.entity.Person;
import java.util.List;
import javax.annotation.Generated;

import static com.hoge.myweb.names.PersonNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Person}のサービスクラスです。
 * 
 */
@Generated(value = { "S2JDBC-Gen 2.4.43",
        "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2011/06/20 14:14:14")
public class PersonService extends AbstractService<Person> {

    public List<Person> findByLevel(Integer level) {
        return select().where("level = ?", level).getResultList();
    }

    public Person findByCode(String code) {
        return select().where("code = ?", code).getSingleResult();
    }

    public Person findByName(String name) {
        return select().where("name = ?", name).getSingleResult();
    }

    public Person findByMailAddress(String mailAddress) {
        return select().where("mail_address = ?", mailAddress)
                .getSingleResult();
    }

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Person findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Person> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}