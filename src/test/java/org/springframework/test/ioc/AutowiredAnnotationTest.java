package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Person;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Shengchao Zhou
 * @date 2025/5/17 22:11
 */
public class AutowiredAnnotationTest {

    @Test
    public void testAutowiredAnnotation() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:autowired-annotation.xml");

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
        assertThat(person.getCar()).isNotNull();
    }
}
