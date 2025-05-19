package org.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author Shengchao Zhou
 * @date 2025/5/15 21:54
 *
 * 1. @Target(ElementType.TYPE)
 * 表示该注解可以用在什么地方。
 * ElementType.TYPE 表示：这个注解只能用于类、接口、枚举上。
 * 所以你只能把 @Component 标注在类上，不能标注在方法或字段上。
 * 2. @Retention(RetentionPolicy.RUNTIME)
 * 表示该注解的生命周期。
 * RetentionPolicy.RUNTIME 表示：注解会在运行时保留，并且可以通过反射读取。
 * 这很关键：Spring 容器在运行时会通过反射扫描带有 @Component 的类，注册为 Bean。
 * 3. @Documented
 * 表示使用该注解的类，生成 JavaDoc 文档时会包含该注解。
 * 属于文档层面，无功能性影响。
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {
    // 表示 @Component 注解有一个名为 value 的属性，类型是 String，默认值是空字符串。
    String value() default "";
}