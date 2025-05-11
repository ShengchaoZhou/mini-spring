package org.springframework.aop;

/**
 * 用于筛选类级别的匹配条件
 *
 * @author Shengchao Zhou
 * @date 2025/5/11 21:39
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
