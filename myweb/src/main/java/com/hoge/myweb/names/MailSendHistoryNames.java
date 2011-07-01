package com.hoge.myweb.names;

import com.hoge.myweb.entity.MailSendHistory;
import com.hoge.myweb.names.PersonNames._PersonNames;
import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MailSendHistory}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.43", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2011/06/28 15:39:52")
public class MailSendHistoryNames {

    /**
     * mailDataIdのプロパティ名を返します。
     * 
     * @return mailDataIdのプロパティ名
     */
    public static PropertyName<Integer> mailDataId() {
        return new PropertyName<Integer>("mailDataId");
    }

    /**
     * fromAddressのプロパティ名を返します。
     * 
     * @return fromAddressのプロパティ名
     */
    public static PropertyName<String> fromAddress() {
        return new PropertyName<String>("fromAddress");
    }

    /**
     * toAddressのプロパティ名を返します。
     * 
     * @return toAddressのプロパティ名
     */
    public static PropertyName<String> toAddress() {
        return new PropertyName<String>("toAddress");
    }

    /**
     * subjectのプロパティ名を返します。
     * 
     * @return subjectのプロパティ名
     */
    public static PropertyName<String> subject() {
        return new PropertyName<String>("subject");
    }

    /**
     * bodyTextのプロパティ名を返します。
     * 
     * @return bodyTextのプロパティ名
     */
    public static PropertyName<String> bodyText() {
        return new PropertyName<String>("bodyText");
    }

    /**
     * commentのプロパティ名を返します。
     * 
     * @return commentのプロパティ名
     */
    public static PropertyName<String> comment() {
        return new PropertyName<String>("comment");
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
    public static class _MailSendHistoryNames extends PropertyName<MailSendHistory> {

        /**
         * インスタンスを構築します。
         */
        public _MailSendHistoryNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MailSendHistoryNames(final String name) {
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
        public _MailSendHistoryNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * mailDataIdのプロパティ名を返します。
         *
         * @return mailDataIdのプロパティ名
         */
        public PropertyName<Integer> mailDataId() {
            return new PropertyName<Integer>(this, "mailDataId");
        }

        /**
         * fromAddressのプロパティ名を返します。
         *
         * @return fromAddressのプロパティ名
         */
        public PropertyName<String> fromAddress() {
            return new PropertyName<String>(this, "fromAddress");
        }

        /**
         * toAddressのプロパティ名を返します。
         *
         * @return toAddressのプロパティ名
         */
        public PropertyName<String> toAddress() {
            return new PropertyName<String>(this, "toAddress");
        }

        /**
         * subjectのプロパティ名を返します。
         *
         * @return subjectのプロパティ名
         */
        public PropertyName<String> subject() {
            return new PropertyName<String>(this, "subject");
        }

        /**
         * bodyTextのプロパティ名を返します。
         *
         * @return bodyTextのプロパティ名
         */
        public PropertyName<String> bodyText() {
            return new PropertyName<String>(this, "bodyText");
        }

        /**
         * commentのプロパティ名を返します。
         *
         * @return commentのプロパティ名
         */
        public PropertyName<String> comment() {
            return new PropertyName<String>(this, "comment");
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