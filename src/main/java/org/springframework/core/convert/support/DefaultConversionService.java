package org.springframework.core.convert.support;


import org.springframework.core.convert.converter.ConverterRegistry;

/**
 * @author Shengchao Zhou
 * @date 2025/5/18 23:43
 */
public class DefaultConversionService extends GenericConversionService {

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
        //TODO 添加其他ConverterFactory
    }
}
