package com.hoge.myweb.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.entity.Article;
import com.hoge.myweb.entity.Board;
import com.hoge.myweb.entity.Comment;
import com.hoge.myweb.form.CommentForm;
import com.hoge.myweb.service.ArticleService;
import com.hoge.myweb.service.BoardService;
import com.hoge.myweb.service.CommentService;

public class CommentAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    protected CommentService commentService;

    @Resource
    protected ArticleService articleService;

    @Resource
    protected BoardService boardService;

    @ActionForm
    @Resource(name = "commentForm")
    protected CommentForm form;

    public List<Comment> comments;

    public Article article;

    public Board board;

    /**
     * デフォルト
     * @return
     */
    @Execute(validator = false)
    public String index() {
        article = articleService.findByIdWithBoard(form.articleId);
        board = article.board;
        comments = commentService.findByArticleIdWithPerson(form.articleId);
        return indexJsp;
    }

    /**
     * 編集呼び出し
     * @return
     */
    @Execute(validator = false)
    public String edit() {

        Comment entity = commentService.findById(form.id);
        BeanUtil.copyProperties(entity, form);

        return index();
    }

    /**
     * 削除
     * @return
     */
    @Execute(validator = false)
    public String delete() {

        Comment comment = commentService.findById(form.id);
        commentService.delete(comment);
        addMessage("message.deleted");
        form.id = null;

        return index();
    }

    /**
     * 保存
     * @return
     */
    @Execute(validator = true, input = indexJsp)
    public String save() {

        Comment comment = null;
        if (form.id != null && form.id > 0) {
            comment = commentService.findById(form.id);
            BeanUtil.copyProperties(form, comment);

            comment.updatedAt = new Date();
            comment.updatedPersonId = userDto.id;
            commentService.update(comment);

            addMessage("message.updated");

        } else {
            comment = new Comment();
            BeanUtil.copyProperties(form, comment);

            Date dt = new Date();
            comment.createdAt = dt;
            comment.createdPersonId = userDto.id;
            comment.updatedAt = dt;
            comment.updatedPersonId = userDto.id;
            commentService.insert(comment);

            addMessage("message.saved");

        }

        return index();
    }

}
