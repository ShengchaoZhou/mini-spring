package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * Advisor是包含一个Pointcut和一个Advice的组合
 *
 * @author Shengchao Zhou
 * @date 2025/5/14 22:24
 */
public interface Advisor {
    Advice getAdvice();
}
