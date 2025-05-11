package org.springframework.beans.factory;

/**
 * @author Shengchao Zhou
 * @date 2025/5/10 21:19
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
