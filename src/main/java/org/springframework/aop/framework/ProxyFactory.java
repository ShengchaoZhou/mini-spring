package org.springframework.aop.framework;

import org.springframework.aop.AdvisedSupport;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 21:13
 */
public class ProxyFactory extends AdvisedSupport {

    public ProxyFactory() {
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (this.isProxyTargetClass() || this.getTargetSource().getTargetClass().length == 0) {
            return new CglibAopProxy(this);
        }

        return new JdkDynamicAopProxy(this);
    }
}
