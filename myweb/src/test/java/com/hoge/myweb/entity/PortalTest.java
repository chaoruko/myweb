package com.hoge.myweb.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static com.hoge.myweb.names.PortalNames.*;

/**
 * {@link Portal}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2011/06/23 13:25:55")
public class PortalTest extends S2TestCase {

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
        jdbcManager.from(Portal.class).id(1).getSingleResult();
    }

    /**
     * createdPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_createdPerson() throws Exception {
        jdbcManager.from(Portal.class).leftOuterJoin(createdPerson()).id(1).getSingleResult();
    }

    /**
     * updatedPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_updatedPerson() throws Exception {
        jdbcManager.from(Portal.class).leftOuterJoin(updatedPerson()).id(1).getSingleResult();
    }
}