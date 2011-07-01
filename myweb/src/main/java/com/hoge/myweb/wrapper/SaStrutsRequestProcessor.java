package com.hoge.myweb.wrapper;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.seasar.struts.action.S2RequestProcessor;
import org.seasar.struts.config.S2ActionMapping;

public class SaStrutsRequestProcessor extends S2RequestProcessor {
    /*
     * (非 Javadoc)
     * @see org.seasar.struts.action.S2RequestProcessor#processActionCreate(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.apache.struts.action.ActionMapping)
     */
    @Override
    protected Action processActionCreate(HttpServletRequest request,
            HttpServletResponse response, ActionMapping mapping)
            throws IOException {

        Action action = null;
        try {
            action = new SaStrutsActionWrapper(((S2ActionMapping) mapping));
        } catch (Exception e) {
            log.error(
                    getInternal().getMessage("actionCreate", mapping.getPath()),
                    e);
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                    getInternal().getMessage("actionCreate", mapping.getPath()));
            return null;
        }
        action.setServlet(servlet);
        return action;
    }
}
