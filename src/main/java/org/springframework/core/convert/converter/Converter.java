package org.springframework.core.convert.converter;

/**
 * @author Shengchao Zhou
 * @date 2025/5/18 22:38
 */
public interface Converter<S, T> {

    /**
     * 类型转换
     */
    T convert(S source);
}
