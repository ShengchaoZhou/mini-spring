package org.springframework.test.bean;

import org.springframework.stereotype.Component;

/**
 * @author Shengchao Zhou
 * @date 2025/5/5 23:50
 */
@Component
public class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
