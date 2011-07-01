package com.hoge.myweb.wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.arnx.jsonic.JSON;
import net.arnx.jsonic.JSONException;
import org.apache.struts.validator.Resources;
import org.apache.struts.Globals;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.MessageResources;
import org.seasar.framework.container.deployer.InstanceDefFactory;
import org.seasar.framework.util.MethodUtil;
import org.seasar.struts.action.ActionWrapper;
import org.seasar.struts.config.S2ActionMapping;
import org.seasar.struts.config.S2ExecuteConfig;
import org.seasar.struts.config.S2ValidationConfig;
import org.seasar.struts.util.ActionMessagesUtil;
import org.seasar.struts.util.RequestUtil;
import org.seasar.struts.util.ResponseUtil;

public class SaStrutsActionWrapper extends ActionWrapper {
    /**
     * コンストラクタ
     * @param actionMapping
     */
    public SaStrutsActionWrapper(S2ActionMapping actionMapping) {
        super(actionMapping);
    }

    @Override
    protected ActionForward execute(HttpServletRequest request,
            S2ExecuteConfig executeConfig) {
        ActionMessages errors = new ActionMessages();

        List<S2ValidationConfig> validationConfigs = executeConfig
                .getValidationConfigs();

        if (validationConfigs != null) {
            for (S2ValidationConfig cfg : validationConfigs) {
                if (cfg.isValidator()) {
                    ActionMessages errors2 = validateUsingValidator(request,
                            executeConfig);
                    if (errors2 != null && !errors2.isEmpty()) {
                        errors.add(errors2);
                        if (executeConfig.isStopOnValidationError()) {
                            return processErrors(errors, request, executeConfig);
                        }
                    }
                } else {
                    Object target = actionForm;
                    if (cfg.getValidateMethod()
                            .getDeclaringClass()
                            .isAssignableFrom(
                                    actionMapping.getComponentDef()
                                            .getComponentClass())) {
                        target = action;
                    }
                    ActionMessages errors2 = (ActionMessages) MethodUtil
                            .invoke(cfg.getValidateMethod(), target, null);
                    if (errors2 != null && !errors2.isEmpty()) {
                        errors.add(errors2);
                        if (executeConfig.isStopOnValidationError()) {
                            // @executeのinputがajaxだった場合
                            if (executeConfig.getInput().equals("ajax")) {
                                // JSON形式のERROR MSGを作成
                                createJsonErrMsg(errors, request);
                                return null;
                            }
                            return processErrors(errors, request, executeConfig);
                        }
                    }
                }
            }
        }
        if (!errors.isEmpty()) {
            return processErrors(errors, request, executeConfig);
        }
        String next = (String) MethodUtil.invoke(executeConfig.getMethod(),
                action, null);
        if (executeConfig.isRemoveActionForm()
                && !ActionMessagesUtil.hasErrors(request)) {
            if (actionMapping.getActionFormComponentDef().getInstanceDef()
                    .equals(InstanceDefFactory.SESSION)) {
                RequestUtil
                        .getRequest()
                        .getSession()
                        .removeAttribute(
                                actionMapping.getActionFormComponentDef()
                                        .getComponentName());
            } else {
                RequestUtil.getRequest().removeAttribute(
                        actionMapping.getActionFormComponentDef()
                                .getComponentName());
            }
            RequestUtil.getRequest().removeAttribute(
                    actionMapping.getAttribute());
        } else {
            if (ActionMessagesUtil.hasErrors(request)) {
                // @executeのinputがajaxだった場合
                if (executeConfig.getInput() != null
                        && executeConfig.getInput().equals("ajax")) {
                    errors.add((ActionMessages) request
                            .getAttribute(Globals.ERROR_KEY));
                    // JSON形式のERROR MSGを作成
                    createJsonErrMsg(errors, request);
                    return null;
                }
            }
        }
        boolean redirect = executeConfig.isRedirect();
        if (redirect && ActionMessagesUtil.hasErrors(request)) {
            redirect = false;
        }
        return actionMapping.createForward(next, redirect);
    }

    @Override
    protected ActionForward processErrors(ActionMessages errors,
            HttpServletRequest request, S2ExecuteConfig executeConfig) {
        // @executeのinputがajaxだった場合
        if (executeConfig.getInput().equals("ajax")) {
            // JSON形式のERROR MSGを作成
            createJsonErrMsg(errors, request);
            return null;
        }

        return super.processErrors(errors, request, executeConfig);
    }

    /**
     * JSON形式のエラーメッセージを生成します。
     * @param errors
     * @param request
     * @throws JSONException
     */
    @SuppressWarnings("unchecked")
    private void createJsonErrMsg(ActionMessages errors,
            HttpServletRequest request) throws JSONException {
        // JSON形式で返す
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", "validate");
        List<Object> list = new ArrayList<Object>();
        for (Iterator<String> it = errors.properties(); it.hasNext();) {
            Map<String, String> err = new HashMap<String, String>();
            String key = it.next();
            err.put("name", key);
            for (Iterator<ActionMessage> ite = errors.get(key); ite.hasNext();) {
                ActionMessage error = ite.next();
                System.out.println(error);
                MessageResources mResouces = Resources
                        .getMessageResources(request);
                String msg = mResouces.getMessage((Locale) null,
                        error.getKey(), error.getValues());
                System.out.println(msg);
                err.put("val", msg);
            }

            list.add(err);
        }
        map.put("errors", list);
        ResponseUtil.write(JSON.encode(map), "application/json");
    }
}
