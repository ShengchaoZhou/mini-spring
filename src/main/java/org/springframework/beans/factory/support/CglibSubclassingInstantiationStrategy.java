package org.springframework.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Shengchao Zhou
 * @date 2025/5/5 20:16
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    /**
     * 使用CGLIB动态生成子类
     *
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, argsTemp, proxy) -> proxy.invokeSuper(obj,argsTemp));
        return enhancer.create();
    }
}
