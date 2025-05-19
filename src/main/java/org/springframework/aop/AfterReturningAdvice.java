package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 19:28
 */
public interface AfterReturningAdvice extends AfterAdvice {

    void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable;
}
