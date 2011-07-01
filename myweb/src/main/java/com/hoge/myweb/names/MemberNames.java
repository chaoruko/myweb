package com.hoge.myweb.names;

import com.hoge.myweb.entity.Member;
import com.hoge.myweb.names.ClusterNames._ClusterNames;
import com.hoge.myweb.names.PersonNames._PersonNames;
import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Member}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2011/06/28 15:39:52")
public class MemberNames {

    /**
     * personIdのプロパティ名を返します。
     * 
     * @return personIdのプロパティ名
     */
    public static PropertyName<Integer> personId() {
        return new PropertyName<Integer>("personId");
    }

    /**
     * clusterIdのプロパティ名を返します。
     * 
     * @return clusterIdのプロパティ名
     */
    public static PropertyName<Integer> clusterId() {
        return new PropertyName<Integer>("clusterId");
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
     * personのプロパティ名を返します。
     * 
     * @return personのプロパティ名
     */
    public static _PersonNames person() {
        return new _PersonNames("person");
    }

    /**
     * clusterのプロパティ名を返します。
     * 
     * @return clusterのプロパティ名
     */
    public static _ClusterNames cluster() {
        return new _ClusterNames("cluster");
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
    public static class _MemberNames extends PropertyName<Member> {

        /**
         * インスタンスを構築します。
         */
        public _MemberNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MemberNames(final String name) {
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
        public _MemberNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * personIdのプロパティ名を返します。
         *
         * @return personIdのプロパティ名
         */
        public PropertyName<Integer> personId() {
            return new PropertyName<Integer>(this, "personId");
        }

        /**
         * clusterIdのプロパティ名を返します。
         *
         * @return clusterIdのプロパティ名
         */
        public PropertyName<Integer> clusterId() {
            return new PropertyName<Integer>(this, "clusterId");
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
         * personのプロパティ名を返します。
         * 
         * @return personのプロパティ名
         */
        public _PersonNames person() {
            return new _PersonNames(this, "person");
        }

        /**
         * clusterのプロパティ名を返します。
         * 
         * @return clusterのプロパティ名
         */
        public _ClusterNames cluster() {
            return new _ClusterNames(this, "cluster");
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