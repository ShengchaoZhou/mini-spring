package org.springframework.context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Shengchao Zhou
 * @date 2025/5/10 22:16
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);

}
