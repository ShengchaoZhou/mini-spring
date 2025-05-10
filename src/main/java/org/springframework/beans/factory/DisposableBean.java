package org.springframework.beans.factory;

/**
 * @author Shengchao Zhou
 * @date 2025/5/9 22:25
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
