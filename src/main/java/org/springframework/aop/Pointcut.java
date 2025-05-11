package org.springframework.aop;

/**
 *  是 Spring AOP 中切点的核心抽象接口，用于确定 Advice 应该作用在哪些连接点上
 *
 * @author Shengchao Zhou
 * @date 2025/5/11 21:38
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
