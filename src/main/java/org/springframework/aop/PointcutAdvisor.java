package org.springframework.aop;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 22:27
 */
public interface PointcutAdvisor extends Advisor{
    Pointcut getPointcut();
}
