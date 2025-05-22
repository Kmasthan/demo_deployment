package com.junit_testing.JunitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.junit_testing.service.CalculationsService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = JunitTestingApplicationTests.TestConfig.class)
class JunitTestingApplicationTests {

    @Autowired
    private CalculationsService calculationsService;

    @Test
    void testGetAdditionOfTwoNumbers() {
        int result = calculationsService.getAdditionOfTwoNumbers(10, 2);
        assertEquals(12, result);
    }

    @Configuration
    @ComponentScan(basePackages = "com.junit_testing")
    static class TestConfig {
        // This tells Spring to scan your services in main/java
    }
}
