package org.springframework.test.service;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 20:10
 */
public class WorldServiceImpl implements WorldService{
    @Override
    public void explode() {
        System.out.println("The Earth is going to explode");
    }
}
