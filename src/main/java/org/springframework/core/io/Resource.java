package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Shengchao Zhou
 * @date 2025/5/6 9:54
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
