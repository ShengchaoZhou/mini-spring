package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 17:32
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}