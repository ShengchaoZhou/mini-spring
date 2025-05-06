package org.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shengchao Zhou
 * @date 2025/5/5 22:02
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        /**
         * new PropertyValue[0]可以确保你最终得到的是 PropertyValue[] 类型的数组，
         * 而不是 Object[]，这样避免了类型转换问题。
         * new PropertyValue[propertyValueList.size()]也并不会更快。
         */
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue pv = this.propertyValueList.get(i);
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}