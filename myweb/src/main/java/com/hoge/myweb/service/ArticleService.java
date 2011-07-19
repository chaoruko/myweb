package com.hoge.myweb.service;

import static com.hoge.myweb.names.ArticleNames.board;
import static com.hoge.myweb.names.ArticleNames.createdPerson;
import static com.hoge.myweb.names.ArticleNames.id;
import static com.hoge.myweb.names.ArticleNames.updatedPerson;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import com.hoge.myweb.entity.Article;

/**
 * {@link Article}のサービスクラスです。
 * 
 */
@Generated(value = { "S2JDBC-Gen 2.4.43",
        "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2011/06/20 14:14:14")
public class ArticleService extends AbstractService<Article> {

    public List<Article> findPageByBoardId(Integer boardId, int limit,
            String pageNum) {
        return select().where(" board_id = ?", boardId)
                .leftOuterJoin(createdPerson()).leftOuterJoin(updatedPerson())
                .orderBy(desc(id())).limit(limit)
                .offset((Integer.parseInt(pageNum) - 1) * limit)
                .getResultList();
    }

    public long getCountByBoardId(Integer boardId) {
        return select().where(" board_id = ?", boardId).getCount();
    }

    /**
     * .leftOuterJoin(createdPerson())
     * .leftOuterJoin(updatedPerson())
     * @param boardId
     * @return
     */
    public List<Article> findAllByBoardId(Integer boardId) {
        return select().where(" board_id = ?", boardId)
                .leftOuterJoin(createdPerson()).leftOuterJoin(updatedPerson())
                .orderBy(desc(id())).getResultList();
    }

    /**
     * .leftOuterJoin(board())
     * @param id
     * @return
     */
    public Article findByIdWithBoard(Integer id) {
        return select().id(id).leftOuterJoin(board()).getSingleResult();
    }

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Article findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Article> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}