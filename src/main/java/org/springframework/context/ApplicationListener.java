package org.springframework.context;

import java.util.EventListener;

/**
 * @author Shengchao Zhou
 * @date 2025/5/10 22:27
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    // 事件触发后，调用该方法响应处理
    void onApplicationEvent(E event);
}