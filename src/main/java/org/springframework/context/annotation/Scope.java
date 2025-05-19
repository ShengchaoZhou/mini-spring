package org.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author Shengchao Zhou
 * @date 2025/5/15 22:01
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
