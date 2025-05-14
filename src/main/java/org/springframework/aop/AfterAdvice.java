package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 21:44
 */
public interface AfterAdvice extends Advice {
    void after(Method method, Object[] args, Object target) throws Throwable;
}
