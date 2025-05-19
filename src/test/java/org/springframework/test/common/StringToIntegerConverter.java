package org.springframework.test.common;

import org.springframework.core.convert.converter.Converter;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 0:01
 */
public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
