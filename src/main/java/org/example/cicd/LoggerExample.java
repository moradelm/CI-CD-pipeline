package org.example.cicd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerExample {
    private static final Logger logger = LogManager.getLogger(LoggerExample.class);

    @GetMapping("/log")
    public String logMessage() {
        logger.info("Test message");
        return "Logged!";
    }
}
