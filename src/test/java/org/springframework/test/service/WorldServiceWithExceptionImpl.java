package org.springframework.test.service;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 21:52
 */
public class WorldServiceWithExceptionImpl implements WorldService {
    @Override
    public void explode() {
        System.out.println("The Earth is going to explode with an Exception");
        throw new RuntimeException();
    }
}
