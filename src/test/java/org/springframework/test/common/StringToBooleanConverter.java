package org.springframework.test.common;

import org.springframework.core.convert.converter.GenericConverter;

import java.util.Collections;
import java.util.Set;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 0:00
 */
public class StringToBooleanConverter implements GenericConverter {
    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(String.class, Boolean.class));
    }

    @Override
    public Object convert(Object source, Class sourceType, Class targetType) {
        return Boolean.valueOf((String) source);
    }
}
