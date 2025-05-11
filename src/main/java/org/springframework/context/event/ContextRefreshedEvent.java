package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author Shengchao Zhou
 * @date 2025/5/10 22:39
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

    public ContextRefreshedEvent(ApplicationContext source) {
        super(source);
    }
}
