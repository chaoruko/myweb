package com.hoge.myweb.service;

import static com.hoge.myweb.names.BoardNames.*;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import com.hoge.myweb.entity.Board;

/**
 * {@link Board}のサービスクラスです。
 * 
 */
@Generated(value = { "S2JDBC-Gen 2.4.43",
        "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2011/06/20 14:14:14")
public class BoardService extends AbstractService<Board> {

    public List<Board> findAllByEntryType(Integer type) {
        return select().orderBy(asc(id())).where("entry_type=", type)
                .getResultList();
    }

    public List<Board> findAllByEntryTypeWithAdmin(Integer type) {
        return select().leftOuterJoin(adminPerson()).where("entry_type=", type)
                .orderBy(asc(id())).getResultList();
    }

    public List<Board> findAllBoardsWithAdmin() {
        return select().leftOuterJoin(adminPerson())
                .where("entry_type = ?", Board.ENTRY_BOARD).orderBy(asc(id()))
                .getResultList();
    }

    public List<Board> findAllBlogsWithAdmin() {
        return select().leftOuterJoin(adminPerson())
                .where("entry_type = ?", Board.ENTRY_BLOG).orderBy(asc(id()))
                .getResultList();
    }

    @Override
    public int insert(Board entity) {
        if (entity.entryType == null) {
            entity.entryType = Board.ENTRY_BOARD;
        }
        return super.insert(entity);
    }

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Board findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Board> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

}