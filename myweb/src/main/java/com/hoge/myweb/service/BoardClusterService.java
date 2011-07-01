package com.hoge.myweb.service;

import com.hoge.myweb.entity.BoardCluster;
import java.util.List;
import javax.annotation.Generated;

import static com.hoge.myweb.names.BoardClusterNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link BoardCluster}のサービスクラスです。
 * 
 */
@Generated(value = { "S2JDBC-Gen 2.4.43",
        "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2011/06/23 15:30:00")
public class BoardClusterService extends AbstractService<BoardCluster> {

    public List<BoardCluster> findAllByBoardId(Integer borderId) {
        return select().orderBy(asc(id())).where("border_id = ?", borderId)
                .getResultList();
    }

    public List<BoardCluster> findAllByBoardIdWithCluster(Integer borderId) {
        return select().orderBy(asc(id())).leftOuterJoin(cluster())
                .where("border_id = ?", borderId).getResultList();
    }

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public BoardCluster findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<BoardCluster> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}