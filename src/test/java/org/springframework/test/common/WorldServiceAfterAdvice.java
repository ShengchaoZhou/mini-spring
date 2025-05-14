package org.springframework.test.common;

import org.springframework.aop.AfterAdvice;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 21:49
 */
public class WorldServiceAfterAdvice implements AfterAdvice {

    @Override
    public void after(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("AfterAdvice: do something after the earth explodes");
    }
}
