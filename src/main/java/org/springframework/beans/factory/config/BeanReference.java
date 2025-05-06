package org.springframework.beans.factory.config;

/**
 * @author Shengchao Zhou
 * @date 2025/5/6 0:04
 */
public class BeanReference {
    // final修饰后不能有set函数
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
