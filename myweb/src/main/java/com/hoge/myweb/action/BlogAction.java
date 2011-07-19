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

    public final static String blogsJsp = "blogs.jsp";
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

    public List<Board> blogs;
    public Board board;

    public long totalCount;
    public long totalPage;
    public int pageNum;

    public String pageLinks;

    @Execute(validator = false)
    public String index() {
        if (form.boardId == null || form.boardId.intValue() == 0) {
            blogs = boardService.findAllBlogsWithAdmin();
            return blogsJsp;
        }
        board = boardService.findById(form.boardId);
        //        articles = articleService.findAllByBoardId(form.boardId);
        if (form.pageNum == null || "".equals(form.pageNum)) {
            form.pageNum = "1";
        }
        if (Integer.parseInt(form.pageNum) < 1) {
            form.pageNum = "1";
        }

        totalCount = articleService.getCountByBoardId(form.boardId);
        totalPage = (long) Math.ceil((double) totalCount / PER_PAGE);
        articles = articleService.findPageByBoardId(form.boardId, PER_PAGE,
                form.pageNum);
        pageNum = Integer.parseInt(form.pageNum);

        String[] links = new String[(int) totalPage];

        int currentPageNo = Integer.parseInt(form.pageNum);
        
        for (int i = 1; i <= totalPage; i++) {
            if (i == currentPageNo) {
                links[i - 1] = String.format("<span><b>%d</b></span>",
                        currentPageNo);
            } else {
                links[i - 1] = String
                        .format("<a title='Page %d' href='/myweb/blog/?boardId=%d&pageNum=%d'>%d</a>",
                                i, form.boardId.intValue(), i, i);
            }
        }

        pageLinks = concat(" ", links);

        return indexJsp;
    }

    @Execute(validator = false)
    public String create() {
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
