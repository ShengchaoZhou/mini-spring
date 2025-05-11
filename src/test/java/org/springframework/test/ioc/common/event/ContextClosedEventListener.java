package org.springframework.test.ioc.common.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * @author Shengchao Zhou
 * @date 2025/5/11 20:41
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println(this.getClass().getName());
    }
}
