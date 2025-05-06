package org.springframework.test.ioc;

/**
 * @author Shengchao Zhou
 * @date 2025/5/4 22:04
 */
public class HelloService {
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}