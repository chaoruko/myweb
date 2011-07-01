package com.hoge.myweb.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static com.hoge.myweb.names.BoardClusterNames.*;

/**
 * {@link BoardCluster}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2011/06/23 15:30:01")
public class BoardClusterTest extends S2TestCase {

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
        jdbcManager.from(BoardCluster.class).id(1).getSingleResult();
    }

    /**
     * boardとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_board() throws Exception {
        jdbcManager.from(BoardCluster.class).leftOuterJoin(board()).id(1).getSingleResult();
    }

    /**
     * clusterとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_cluster() throws Exception {
        jdbcManager.from(BoardCluster.class).leftOuterJoin(cluster()).id(1).getSingleResult();
    }

    /**
     * createdPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_createdPerson() throws Exception {
        jdbcManager.from(BoardCluster.class).leftOuterJoin(createdPerson()).id(1).getSingleResult();
    }

    /**
     * updatedPersonとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_updatedPerson() throws Exception {
        jdbcManager.from(BoardCluster.class).leftOuterJoin(updatedPerson()).id(1).getSingleResult();
    }
}