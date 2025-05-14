package org.springframework.aop.framework;

import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * 反射方法的调用
 * 用来封装方法调用上下文的执行器，它在拦截器链中作为“中间调度器”控制方法调用流程
 *
 * @author Shengchao Zhou
 * @date 2025/5/14 19:45
 */
public class ReflectiveMethodInvocation implements MethodInvocation {

    private final Object target;

    private final Method method;

    private final Object[] arguments;

    public ReflectiveMethodInvocation(Object target, Method method, Object[] arguments) {
        this.target = target;
        this.method = method;
        this.arguments = arguments;
    }

    @Override
    public Object proceed() throws Throwable {
        return method.invoke(target, arguments);
    }

    @Override
    public Method getMethod() {
        return method;
    }

    @Override
    public Object[] getArguments() {
        return arguments;
    }

    @Override
    public Object getThis() {
        return target;
    }

    @Override
    public AccessibleObject getStaticPart() {
        return method;
    }
}
