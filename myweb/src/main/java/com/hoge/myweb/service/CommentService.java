package com.hoge.myweb.service;

import static com.hoge.myweb.names.ArticleNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import com.hoge.myweb.entity.Comment;

/**
 * {@link Comment}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2011/06/20 14:14:14")
public class CommentService extends AbstractService<Comment> {

    /**
     * 記事のすべてのコメントを検索します。
     * @param articleId
     * @return
     */
    public List<Comment> findByArticleIdWithPerson(Integer articleId) {
        return select().where(" article_id = ?", articleId)
                .leftOuterJoin(createdPerson()).leftOuterJoin(updatedPerson())
                .orderBy(desc(createdAt())).getResultList();
    }    
    
    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Comment findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Comment> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}