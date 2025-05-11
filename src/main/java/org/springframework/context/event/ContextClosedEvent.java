package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author Shengchao Zhou
 * @date 2025/5/10 22:39
 */
public class ContextClosedEvent extends ApplicationContextEvent {

    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
