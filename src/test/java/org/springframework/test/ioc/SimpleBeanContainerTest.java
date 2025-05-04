package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() throws Exception {

    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}