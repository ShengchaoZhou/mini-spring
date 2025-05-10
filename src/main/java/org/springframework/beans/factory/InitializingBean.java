package org.springframework.beans.factory;

/**
 * @author Shengchao Zhou
 * @date 2025/5/9 22:24
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
