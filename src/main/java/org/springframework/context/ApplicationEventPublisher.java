package org.springframework.context;

/**
 * 事件发布者接口
 *
 * @author Shengchao Zhou
 * @date 2025/5/11 20:28
 */
public interface ApplicationEventPublisher {
    /**
     * 发布事件
     *
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
