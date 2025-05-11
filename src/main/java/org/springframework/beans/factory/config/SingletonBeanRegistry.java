package org.springframework.beans.factory.config;

/**
 * @author Shengchao Zhou
 * @date 2025/5/3 21:20
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);

}
