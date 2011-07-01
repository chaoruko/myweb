package com.hoge.myweb.names;

import com.hoge.myweb.entity.Board;
import com.hoge.myweb.names.ArticleNames._ArticleNames;
import com.hoge.myweb.names.BoardClusterNames._BoardClusterNames;
import com.hoge.myweb.names.PersonNames._PersonNames;
import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Board}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2011/06/28 15:39:52")
public class BoardNames {

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * descriptionのプロパティ名を返します。
     * 
     * @return descriptionのプロパティ名
     */
    public static PropertyName<String> description() {
        return new PropertyName<String>("description");
    }

    /**
     * adminPersonIdのプロパティ名を返します。
     * 
     * @return adminPersonIdのプロパティ名
     */
    public static PropertyName<Integer> adminPersonId() {
        return new PropertyName<Integer>("adminPersonId");
    }

    /**
     * entryTypeのプロパティ名を返します。
     * 
     * @return entryTypeのプロパティ名
     */
    public static PropertyName<Integer> entryType() {
        return new PropertyName<Integer>("entryType");
    }

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * createdPersonIdのプロパティ名を返します。
     * 
     * @return createdPersonIdのプロパティ名
     */
    public static PropertyName<Integer> createdPersonId() {
        return new PropertyName<Integer>("createdPersonId");
    }

    /**
     * updatedPersonIdのプロパティ名を返します。
     * 
     * @return updatedPersonIdのプロパティ名
     */
    public static PropertyName<Integer> updatedPersonId() {
        return new PropertyName<Integer>("updatedPersonId");
    }

    /**
     * createdAtのプロパティ名を返します。
     * 
     * @return createdAtのプロパティ名
     */
    public static PropertyName<Date> createdAt() {
        return new PropertyName<Date>("createdAt");
    }

    /**
     * updatedAtのプロパティ名を返します。
     * 
     * @return updatedAtのプロパティ名
     */
    public static PropertyName<Date> updatedAt() {
        return new PropertyName<Date>("updatedAt");
    }

    /**
     * adminPersonのプロパティ名を返します。
     * 
     * @return adminPersonのプロパティ名
     */
    public static _PersonNames adminPerson() {
        return new _PersonNames("adminPerson");
    }

    /**
     * articlesのプロパティ名を返します。
     * 
     * @return articlesのプロパティ名
     */
    public static _ArticleNames articles() {
        return new _ArticleNames("articles");
    }

    /**
     * boardClustersのプロパティ名を返します。
     * 
     * @return boardClustersのプロパティ名
     */
    public static _BoardClusterNames boardClusters() {
        return new _BoardClusterNames("boardClusters");
    }

    /**
     * createdPersonのプロパティ名を返します。
     * 
     * @return createdPersonのプロパティ名
     */
    public static _PersonNames createdPerson() {
        return new _PersonNames("createdPerson");
    }

    /**
     * updatedPersonのプロパティ名を返します。
     * 
     * @return updatedPersonのプロパティ名
     */
    public static _PersonNames updatedPerson() {
        return new _PersonNames("updatedPerson");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _BoardNames extends PropertyName<Board> {

        /**
         * インスタンスを構築します。
         */
        public _BoardNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _BoardNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _BoardNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * descriptionのプロパティ名を返します。
         *
         * @return descriptionのプロパティ名
         */
        public PropertyName<String> description() {
            return new PropertyName<String>(this, "description");
        }

        /**
         * adminPersonIdのプロパティ名を返します。
         *
         * @return adminPersonIdのプロパティ名
         */
        public PropertyName<Integer> adminPersonId() {
            return new PropertyName<Integer>(this, "adminPersonId");
        }

        /**
         * entryTypeのプロパティ名を返します。
         *
         * @return entryTypeのプロパティ名
         */
        public PropertyName<Integer> entryType() {
            return new PropertyName<Integer>(this, "entryType");
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * createdPersonIdのプロパティ名を返します。
         *
         * @return createdPersonIdのプロパティ名
         */
        public PropertyName<Integer> createdPersonId() {
            return new PropertyName<Integer>(this, "createdPersonId");
        }

        /**
         * updatedPersonIdのプロパティ名を返します。
         *
         * @return updatedPersonIdのプロパティ名
         */
        public PropertyName<Integer> updatedPersonId() {
            return new PropertyName<Integer>(this, "updatedPersonId");
        }

        /**
         * createdAtのプロパティ名を返します。
         *
         * @return createdAtのプロパティ名
         */
        public PropertyName<Date> createdAt() {
            return new PropertyName<Date>(this, "createdAt");
        }

        /**
         * updatedAtのプロパティ名を返します。
         *
         * @return updatedAtのプロパティ名
         */
        public PropertyName<Date> updatedAt() {
            return new PropertyName<Date>(this, "updatedAt");
        }

        /**
         * adminPersonのプロパティ名を返します。
         * 
         * @return adminPersonのプロパティ名
         */
        public _PersonNames adminPerson() {
            return new _PersonNames(this, "adminPerson");
        }

        /**
         * articlesのプロパティ名を返します。
         * 
         * @return articlesのプロパティ名
         */
        public _ArticleNames articles() {
            return new _ArticleNames(this, "articles");
        }

        /**
         * boardClustersのプロパティ名を返します。
         * 
         * @return boardClustersのプロパティ名
         */
        public _BoardClusterNames boardClusters() {
            return new _BoardClusterNames(this, "boardClusters");
        }

        /**
         * createdPersonのプロパティ名を返します。
         * 
         * @return createdPersonのプロパティ名
         */
        public _PersonNames createdPerson() {
            return new _PersonNames(this, "createdPerson");
        }

        /**
         * updatedPersonのプロパティ名を返します。
         * 
         * @return updatedPersonのプロパティ名
         */
        public _PersonNames updatedPerson() {
            return new _PersonNames(this, "updatedPerson");
        }
    }
}