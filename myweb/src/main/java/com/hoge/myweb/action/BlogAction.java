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
import com.hoge.myweb.form.ArticleForm;
import com.hoge.myweb.service.ArticleService;
import com.hoge.myweb.service.BoardService;
import com.hoge.myweb.service.CommentService;

public class BlogAction extends BaseAction {

    public final static String indexJsp = "index.jsp";
    public final static String editJsp = "edit.jsp";

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
    public String create(){
        board = boardService.findById(form.boardId);
        return editJsp;
    }
    @Execute(validator = false)
    public String edit() {

        Article board = articleService.findById(form.id);
        BeanUtil.copyProperties(board, form);

        return editJsp;
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
