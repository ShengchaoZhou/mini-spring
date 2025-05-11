package org.springframework.context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * 方便监听器统一处理与容器相关的生命周期事件
 *
 * @author Shengchao Zhou
 * @date 2025/5/10 22:36
 */
public abstract class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(ApplicationContext source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
