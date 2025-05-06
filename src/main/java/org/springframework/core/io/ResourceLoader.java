package org.springframework.core.io;

/**
 * @author Shengchao Zhou
 * @date 2025/5/6 9:58
 */
public interface ResourceLoader {
    Resource getResource(String location);
}
