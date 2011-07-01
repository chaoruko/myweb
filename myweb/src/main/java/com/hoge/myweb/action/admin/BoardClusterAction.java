package com.hoge.myweb.action.admin;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.action.BaseAction;
import com.hoge.myweb.entity.Board;
import com.hoge.myweb.entity.BoardCluster;
import com.hoge.myweb.entity.Cluster;
import com.hoge.myweb.form.BoardClusterForm;
import com.hoge.myweb.service.BoardClusterService;
import com.hoge.myweb.service.BoardService;
import com.hoge.myweb.service.ClusterService;

public class BoardClusterAction extends BaseAction {

    public final static String indexJsp = "index.jsp";

    @Resource
    public BoardService boardService;

    @Resource
    public BoardClusterService boardClusterService;

    @Resource
    public ClusterService clusterService;

    @ActionForm
    @Resource(name = "boardClusterForm")
    public BoardClusterForm form;

    public Board board;

    public List<BoardCluster> boardClusters;

    /** 選択肢 */
    public List<Cluster> clusters;

    @Execute(validator = false)
    public String index() {
        boardClusters = boardClusterService
                .findAllByBoardIdWithCluster(form.boardId);
        board = boardService.findById(form.boardId);
        clusters = clusterService.findAll();
        return indexJsp;
    }

    @Execute(validator = false)
    public String edit() {
        BoardCluster entity = boardClusterService.findById(form.id);
        BeanUtil.copyProperties(entity, form);
        return index();
    }

    @Execute(validator = true, input = indexJsp)
    public String save() {

        BoardCluster entity = null;
        if (form.id != null && form.id > 0) {
            entity = boardClusterService.findById(form.id);
            BeanUtil.copyProperties(form, entity);

            entity.updatedAt = new Date();
            entity.updatedPersonId = userDto.id;
            boardClusterService.update(entity);
            addMessage("message.updated");

        } else {
            entity = new BoardCluster();
            BeanUtil.copyProperties(form, entity);

            Date dt = new Date();
            entity.createdAt = dt;
            entity.createdPersonId = userDto.id;
            entity.updatedAt = dt;
            entity.updatedPersonId = userDto.id;
            boardClusterService.insert(entity);

            addMessage("message.saved");
        }

        return index();
    }
}
