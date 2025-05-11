package org.springframework.test.ioc.common.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Shengchao Zhou
 * @date 2025/5/11 20:45
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(this.getClass().getName());
    }
}
