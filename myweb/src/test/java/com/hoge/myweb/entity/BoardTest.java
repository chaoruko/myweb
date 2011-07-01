package com.hoge.myweb.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static com.hoge.myweb.names.BoardNames.*;

/**
 * {@link Board}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2011/06/22 16:11:22")
public class BoardTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Board.class).id(1).getSingleResult();
    }

    /**
     * adminPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_adminPerson() throws Exception {
        jdbcManager.from(Board.class).leftOuterJoin(adminPerson()).id(1).getSingleResult();
    }

    /**
     * articlesとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_articles() throws Exception {
        jdbcManager.from(Board.class).leftOuterJoin(articles()).id(1).getSingleResult();
    }

    /**
     * createdPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_createdPerson() throws Exception {
        jdbcManager.from(Board.class).leftOuterJoin(createdPerson()).id(1).getSingleResult();
    }

    /**
     * updatedPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_updatedPerson() throws Exception {
        jdbcManager.from(Board.class).leftOuterJoin(updatedPerson()).id(1).getSingleResult();
    }
}