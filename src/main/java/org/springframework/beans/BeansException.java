package org.springframework.beans;

/**
 * @author Shengchao Zhou
 * @date 2025/5/3 21:37
 */
public class BeansException extends RuntimeException {
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
