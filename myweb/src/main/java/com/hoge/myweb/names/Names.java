package com.hoge.myweb.names;

import com.hoge.myweb.entity.Article;
import com.hoge.myweb.entity.Board;
import com.hoge.myweb.entity.BoardCluster;
import com.hoge.myweb.entity.Cluster;
import com.hoge.myweb.entity.Comment;
import com.hoge.myweb.entity.MailData;
import com.hoge.myweb.entity.MailSendHistory;
import com.hoge.myweb.entity.Member;
import com.hoge.myweb.entity.Person;
import com.hoge.myweb.entity.Portal;
import com.hoge.myweb.names.ArticleNames._ArticleNames;
import com.hoge.myweb.names.BoardClusterNames._BoardClusterNames;
import com.hoge.myweb.names.BoardNames._BoardNames;
import com.hoge.myweb.names.ClusterNames._ClusterNames;
import com.hoge.myweb.names.CommentNames._CommentNames;
import com.hoge.myweb.names.MailDataNames._MailDataNames;
import com.hoge.myweb.names.MailSendHistoryNames._MailSendHistoryNames;
import com.hoge.myweb.names.MemberNames._MemberNames;
import com.hoge.myweb.names.PersonNames._PersonNames;
import com.hoge.myweb.names.PortalNames._PortalNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2011/06/28 15:39:52")
public class Names {

    /**
     * {@link Article}の名前クラスを返します。
     * 
     * @return Articleの名前クラス
     */
    public static _ArticleNames article() {
        return new _ArticleNames();
    }

    /**
     * {@link Board}の名前クラスを返します。
     * 
     * @return Boardの名前クラス
     */
    public static _BoardNames board() {
        return new _BoardNames();
    }

    /**
     * {@link BoardCluster}の名前クラスを返します。
     * 
     * @return BoardClusterの名前クラス
     */
    public static _BoardClusterNames boardCluster() {
        return new _BoardClusterNames();
    }

    /**
     * {@link Cluster}の名前クラスを返します。
     * 
     * @return Clusterの名前クラス
     */
    public static _ClusterNames cluster() {
        return new _ClusterNames();
    }

    /**
     * {@link Comment}の名前クラスを返します。
     * 
     * @return Commentの名前クラス
     */
    public static _CommentNames comment() {
        return new _CommentNames();
    }

    /**
     * {@link MailData}の名前クラスを返します。
     * 
     * @return MailDataの名前クラス
     */
    public static _MailDataNames mailData() {
        return new _MailDataNames();
    }

    /**
     * {@link MailSendHistory}の名前クラスを返します。
     * 
     * @return MailSendHistoryの名前クラス
     */
    public static _MailSendHistoryNames mailSendHistory() {
        return new _MailSendHistoryNames();
    }

    /**
     * {@link Member}の名前クラスを返します。
     * 
     * @return Memberの名前クラス
     */
    public static _MemberNames member() {
        return new _MemberNames();
    }

    /**
     * {@link Person}の名前クラスを返します。
     * 
     * @return Personの名前クラス
     */
    public static _PersonNames person() {
        return new _PersonNames();
    }

    /**
     * {@link Portal}の名前クラスを返します。
     * 
     * @return Portalの名前クラス
     */
    public static _PortalNames portal() {
        return new _PortalNames();
    }
}