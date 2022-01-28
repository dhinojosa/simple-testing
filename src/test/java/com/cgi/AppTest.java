package com.cgi;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void testHelloMessage() {
        App app = new App();
        assertThat(app.getMessage()).isEqualTo("Hello");
    }
}
