package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 21:42
 */
public interface BeforeAdvice extends Advice {
    void before(Method method, Object[] args, Object target) throws Throwable;
}
