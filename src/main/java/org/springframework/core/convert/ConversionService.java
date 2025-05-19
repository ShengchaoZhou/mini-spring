package org.springframework.core.convert;

/**
 * 类型转换抽象接口
 * @author Shengchao Zhou
 * @date 2025/5/18 23:45
 */
public interface ConversionService {

    boolean canConvert(Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<T> targetType);
}
