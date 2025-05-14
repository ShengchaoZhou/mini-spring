package org.springframework.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * 封装生成代理对象所需的全部关键信息。简单理解它是“代理的配置载体”。
 *
 * @author Shengchao Zhou
 * @date 2025/5/14 19:18
 */
public class AdvisedSupport {

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    private MethodMatcher methodMatcher;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    public MethodMatcher getMethodMatcher() {
        return methodMatcher;
    }

    public void setMethodMatcher(MethodMatcher methodMatcher) {
        this.methodMatcher = methodMatcher;
    }
}
