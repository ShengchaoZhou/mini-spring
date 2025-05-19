package org.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * 当容器中存在多个相同类型的 Bean，而某处使用 @Autowired 自动注入时，Spring 会抛出异常，因为它不知道应该注入哪一个 Bean。
 * @Qualifier 用来指定注入的具体 Bean 名称，解决多个候选 Bean 时的歧义问题。
 *
 * @author Shengchao Zhou
 * @date 2025/5/17 21:34
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";

}