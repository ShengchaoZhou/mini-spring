package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.A;
import org.springframework.test.bean.B;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 17:05
 */
public class CircularReferenceWithProxyBeanTest {

    @Test
    public void testCircularReference() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:circular-reference-with-proxy-bean.xml");
        A a = applicationContext.getBean("a", A.class);
        B b = applicationContext.getBean("b", B.class);

        assertThat(b.getA() == a).isTrue();
    }
}
