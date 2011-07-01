package com.hoge.myweb.names;

import com.hoge.myweb.entity.Person;
import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Person}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2011/06/28 15:39:52")
public class PersonNames {

    /**
     * codeのプロパティ名を返します。
     * 
     * @return codeのプロパティ名
     */
    public static PropertyName<String> code() {
        return new PropertyName<String>("code");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * mailAddressのプロパティ名を返します。
     * 
     * @return mailAddressのプロパティ名
     */
    public static PropertyName<String> mailAddress() {
        return new PropertyName<String>("mailAddress");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * levelのプロパティ名を返します。
     * 
     * @return levelのプロパティ名
     */
    public static PropertyName<Integer> level() {
        return new PropertyName<Integer>("level");
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
    public static class _PersonNames extends PropertyName<Person> {

        /**
         * インスタンスを構築します。
         */
        public _PersonNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _PersonNames(final String name) {
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
        public _PersonNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * codeのプロパティ名を返します。
         *
         * @return codeのプロパティ名
         */
        public PropertyName<String> code() {
            return new PropertyName<String>(this, "code");
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
         * mailAddressのプロパティ名を返します。
         *
         * @return mailAddressのプロパティ名
         */
        public PropertyName<String> mailAddress() {
            return new PropertyName<String>(this, "mailAddress");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * levelのプロパティ名を返します。
         *
         * @return levelのプロパティ名
         */
        public PropertyName<Integer> level() {
            return new PropertyName<Integer>(this, "level");
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