package org.springframework.core.convert.converter;

/**
 * @author Shengchao Zhou
 * @date 2025/5/18 22:39
 */
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}