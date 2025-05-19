package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Car;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Shengchao Zhou
 * @date 2025/5/15 22:27
 */
public class PackageScanTest {

    @Test
    public void testScanPackage() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:package-scan.xml");

        Car car = applicationContext.getBean("car", Car.class);
        assertThat(car).isNotNull();
    }
}
