package org.springframework.core.convert.converter;

/**
 * 注册类型转换器
 *
 * @author Shengchao Zhou
 * @date 2025/5/18 23:40
 */
public interface ConverterRegistry {

    void addConverter(Converter<?, ?> converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);

    void addConverter(GenericConverter converter);
}
