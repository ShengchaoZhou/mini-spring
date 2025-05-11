package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * 用于筛选方法级别的匹配条件
 *
 * @author Shengchao Zhou
 * @date 2025/5/11 21:38
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
