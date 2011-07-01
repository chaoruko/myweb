package com.hoge.myweb.names;

import com.hoge.myweb.entity.Portal;
import com.hoge.myweb.names.PersonNames._PersonNames;
import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Portal}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2011/06/28 15:39:52")
public class PortalNames {

    /**
     * keyのプロパティ名を返します。
     * 
     * @return keyのプロパティ名
     */
    public static PropertyName<String> key() {
        return new PropertyName<String>("key");
    }

    /**
     * keyIdのプロパティ名を返します。
     * 
     * @return keyIdのプロパティ名
     */
    public static PropertyName<Integer> keyId() {
        return new PropertyName<Integer>("keyId");
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
    public static class _PortalNames extends PropertyName<Portal> {

        /**
         * インスタンスを構築します。
         */
        public _PortalNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _PortalNames(final String name) {
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
        public _PortalNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * keyのプロパティ名を返します。
         *
         * @return keyのプロパティ名
         */
        public PropertyName<String> key() {
            return new PropertyName<String>(this, "key");
        }

        /**
         * keyIdのプロパティ名を返します。
         *
         * @return keyIdのプロパティ名
         */
        public PropertyName<Integer> keyId() {
            return new PropertyName<Integer>(this, "keyId");
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