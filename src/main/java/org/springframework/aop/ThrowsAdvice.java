package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 21:46
 */
public interface ThrowsAdvice extends Advice {
    void throwsHandle(Throwable throwable, Method method, Object[] args, Object target);
}
