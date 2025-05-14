package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 21:45
 */
public interface AfterReturningAdvice extends Advice {

    void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable;
}
