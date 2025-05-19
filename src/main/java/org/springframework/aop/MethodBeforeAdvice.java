package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * Method表示被拦截的方法，对这个方法做前置通知
 *
 * @author Shengchao Zhou
 * @date 2025/5/14 22:28
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}
