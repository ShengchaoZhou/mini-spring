package org.springframework.aop.framework.adapter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 把“前置增强”逻辑适配成统一拦截器接口的桥梁类，确保用户写的before()方法能正确嵌入AOP执行链
 *
 * @author Shengchao Zhou
 * @date 2025/5/14 22:34
 */
public class MethodBeforeAdviceInterceptor implements MethodInterceptor, BeforeAdvice {

    private MethodBeforeAdvice advice;

    public MethodBeforeAdviceInterceptor() {
    }

    public MethodBeforeAdviceInterceptor(MethodBeforeAdvice advice) {
        this.advice = advice;
    }

    public void setAdvice(MethodBeforeAdvice advice) {
        this.advice = advice;
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        //在执行被代理方法之前，先执行before advice操作
        this.advice.before(mi.getMethod(), mi.getArguments(), mi.getThis());
        return mi.proceed();
    }
}
