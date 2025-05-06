package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Shengchao Zhou
 * @date 2025/5/3 21:35
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
