package com.hoge.myweb.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.entity.Article;
import com.hoge.myweb.entity.Board;
import com.hoge.myweb.entity.Portal;
import com.hoge.myweb.service.ArticleService;
import com.hoge.myweb.service.BoardService;
import com.hoge.myweb.service.PortalService;

public class PortalAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    public BoardService boardService;

    @Resource
    public ArticleService articleService;

    @Resource
    public PortalService portalService;

    public List<Board> boards;
    public List<Article> articles;

    @Execute(validator = false)
    public String index() {

        List<Portal> infos = portalService.findInfo();
        boards = new ArrayList<Board>();
        articles = new ArrayList<Article>();
        
        for (Portal portal : infos) {
            Board board = boardService.findById(portal.keyId);
            boards.add(board);
            
            List<Article> tmp = articleService.findAllByBoardId(board.id);
            if (tmp != null && tmp.size() > 0) {
                tmp.get(0).board = board;
                articles.addAll(tmp);
            }
        }

        return indexJsp;
    }
}
