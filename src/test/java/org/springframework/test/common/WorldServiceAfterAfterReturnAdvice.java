package org.springframework.test.common;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/8/10 16:06
 */
public class WorldServiceAfterAfterReturnAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("AfterAfterAdvice: do something after the AfterAdvice");
    }
}
