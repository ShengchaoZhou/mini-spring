package org.springframework.test.common;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 17:03
 */
public class ABeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

    }
}
