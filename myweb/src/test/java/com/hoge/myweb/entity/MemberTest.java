package com.hoge.myweb.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static com.hoge.myweb.names.MemberNames.*;

/**
 * {@link Member}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2011/06/23 14:33:38")
public class MemberTest extends S2TestCase {

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
        jdbcManager.from(Member.class).id(1).getSingleResult();
    }

    /**
     * personとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_person() throws Exception {
        jdbcManager.from(Member.class).leftOuterJoin(person()).id(1).getSingleResult();
    }

    /**
     * clusterとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_cluster() throws Exception {
        jdbcManager.from(Member.class).leftOuterJoin(cluster()).id(1).getSingleResult();
    }

    /**
     * createdPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_createdPerson() throws Exception {
        jdbcManager.from(Member.class).leftOuterJoin(createdPerson()).id(1).getSingleResult();
    }

    /**
     * updatedPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_updatedPerson() throws Exception {
        jdbcManager.from(Member.class).leftOuterJoin(updatedPerson()).id(1).getSingleResult();
    }
}