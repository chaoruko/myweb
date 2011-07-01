package com.hoge.myweb.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import com.hoge.myweb.dto.UserDto;

public class LoginConfirmInterceptor extends AbstractInterceptor {

    private static final long serialVersionUID = 1L;

    @Resource
    protected UserDto userDto;

    /**
     * AbstractInterceptorを継承する際に、実装する必要のあるメソッド。
     * 割り込ませる処理を記述。
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return (!isExecuteMethod(invocation) || isLoggedIn()) ? invocation
                .proceed() : "/login/";
    }

    /**
     * 実行されたActionに@Executeがついていたかどうか。
     * @param invocation
     * @return アノテーションがついていればtrue
     */
    private boolean isExecuteMethod(MethodInvocation invocation) {
        return invocation.getMethod().isAnnotationPresent(Execute.class);
    }

    /**
     * セッション上にDtoがあるか、あった場合その中にuserIDは保持されているか。
     * @return 上記の条件を両方満たしていればtrue
     */
    private boolean isLoggedIn() {
        return (userDto != null && userDto.code != null && userDto.code.length() > 0);
    }
}
