package org.springframework.test.ioc.common.event;

import org.springframework.context.ApplicationListener;

/**
 * @author Shengchao Zhou
 * @date 2025/5/11 20:46
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(this.getClass().getName());
    }
}
