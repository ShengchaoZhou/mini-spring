package org.springframework.aop;

/**
 * 被代理对象的封装
 *
 * @author Shengchao Zhou
 * @date 2025/5/14 19:19
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    // 获取该类实现的所有接口，因为JDK动态代理是基于接口的
    public Class<?>[] getTargetClass() {
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget() {
        return this.target;
    }

}
