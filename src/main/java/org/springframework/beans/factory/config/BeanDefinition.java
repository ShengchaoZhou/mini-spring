package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValues;

/**
 * BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，此处简化只包含class类型
 *
 * @author Shengchao Zhou
 * @date 2025/5/3 21:17
 */
public class BeanDefinition {
    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        // 调用另一个构造方法实现初始化
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
