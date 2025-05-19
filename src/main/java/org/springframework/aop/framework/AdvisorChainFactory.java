package org.springframework.aop.framework;

import org.springframework.aop.AdvisedSupport;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 19:31
 */
public interface AdvisorChainFactory {

    //根据方法和目标类，从配置（AdvisedSupport）中匹配出所有适用的 Advice，并封装为一个“拦截器链”返回
    List<Object> getInterceptorsAndDynamicInterceptionAdvice(AdvisedSupport config, Method method, Class<?> targetClass);

}
