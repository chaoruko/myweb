package com.hoge.myweb.action.admin;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import net.arnx.jsonic.JSON;

import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.Article;
import com.hoge.myweb.entity.Board;
import com.hoge.myweb.entity.Comment;
import com.hoge.myweb.form.ArticleForm;
import com.hoge.myweb.service.ArticleService;
import com.hoge.myweb.service.BoardService;
import com.hoge.myweb.service.CommentService;

public class ArticleAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    protected CommentService commentService;

    @Resource
    protected ArticleService articleService;

    @Resource
    protected BoardService boardService;

    @ActionForm
    @Resource(name = "articleForm")
    protected ArticleForm form;

    public List<Article> articles;
    public List<Comment> comments;

    public Article article;

    public Board board;

    @Execute(validator = false)
    public String index() {
        board = boardService.findById(form.boardId);
        articles = articleService.findAllByBoardId(form.boardId);

        return indexJsp;
    }

    @Execute(validator = false)
    public String test1() throws IOException {
        Integer articleId = form.id;
        List<Comment> comments = commentService
                .findByArticleIdWithPerson(articleId);
        ResponseUtil.getResponse().setContentType("text/javascript");
        ResponseUtil.getResponse().setCharacterEncoding("UTF-8");
        ResponseUtil.getResponse().getWriter().write(JSON.encode(comments));
        return null;
    }

    @Execute(validator = false)
    public String test2() {
        Integer articleId = form.id;
        article = articleService.findById(articleId);
        comments = commentService.findByArticleIdWithPerson(articleId);
        return "comments.jsp";
    }

    @Execute(validator = false)
    public String edit() {

        Article board = articleService.findById(form.id);
        BeanUtil.copyProperties(board, form);

        return index();
    }

    @Execute(validator = false)
    public String delete() {

        Article article = articleService.findById(form.id);
        articleService.delete(article);
        addMessage("message.deleted");
        form.id = null;

        return index();
    }

    @Execute(validator = true, input = indexJsp)
    public String save() {

        Article article = null;
        if (form.id != null && form.id > 0) {
            article = articleService.findById(form.id);
            BeanUtil.copyProperties(form, article);

            article.updatedAt = new Date();
            article.updatedPersonId = userDto.id;
            articleService.update(article);
            addMessage("message.updated");

        } else {
            article = new Article();
            BeanUtil.copyProperties(form, article);

            Date dt = new Date();
            article.createdAt = dt;
            article.createdPersonId = userDto.id;
            article.updatedAt = dt;
            article.updatedPersonId = userDto.id;
            articleService.insert(article);
            addMessage("message.saved");
        }

        return index();
    }

}
