package org.springframework.test.service;

/**
 * @author Shengchao Zhou
 * @date 2025/5/14 20:10
 */
public class WorldServiceImpl implements WorldService {

    private String name;

    @Override
    public void explode() {
        System.out.println("The " + name + " is going to explode");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}