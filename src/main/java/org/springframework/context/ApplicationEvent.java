package org.springframework.context;

import java.util.EventObject;

/**
 * @author Shengchao Zhou
 * @date 2025/5/10 22:22
 */
public class ApplicationEvent extends EventObject {
    public ApplicationEvent(Object source) {
        super(source);
    }
}
