package org.springframework.context.event;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Shengchao Zhou
 * @date 2025/5/10 22:41
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {
    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (ApplicationListener<ApplicationEvent> applicationListener : applicationListeners) {
            if (supportsEvent(applicationListener, event)) {
                applicationListener.onApplicationEvent(event);
            }
        }
    }

    /**
     * 监听器是否对该事件感兴趣
     *
     * @param applicationListener
     * @param event
     * @return
     */
    protected boolean supportsEvent(ApplicationListener<ApplicationEvent> applicationListener, ApplicationEvent event) {
        // 获取监听器实现的第一个泛型接口，假设是 ApplicationListener<CustomEvent>
        Type type = applicationListener.getClass().getGenericInterfaces()[0];

        // 将上面获取到的泛型接口强转为 ParameterizedType，以便获取其泛型参数
        // 即提取出 CustomEvent 类型
        Type actualTypeArgument = ((ParameterizedType) type).getActualTypeArguments()[0];

        // 获取该泛型类型的完整类名字符串，比如 "org.springframework.test.event.CustomEvent"
        String className = actualTypeArgument.getTypeName();

        Class<?> eventClassName;
        try {
            // 将类名字符串转换成真正的 Class 对象，后续可以做类型判断
            eventClassName = Class.forName(className);
        } catch (ClassNotFoundException e) {
            // 如果类名无效，说明监听器泛型声明错误，抛出自定义 BeansException 异常
            throw new BeansException("wrong event class name: " + className);
        }

        // 判断当前事件的类型是否与监听器声明的事件类型兼容（是其本身或子类）
        // 比如 listener 是监听 ApplicationEvent 的，那么所有子类事件都应匹配
        return eventClassName.isAssignableFrom(event.getClass());
    }

}
