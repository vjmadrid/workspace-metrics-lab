package com.acme.metrics.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.acme.metrics.elk.util.GenerateMessageUtil;

@SpringBootApplication
public class ElkApplication {

    private static final Logger LOG = LoggerFactory.getLogger(ElkApplication.class);
    
    private static int NUM_MESSAGES= 100;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ElkApplication.class, args);

        for (int i = 0; i < NUM_MESSAGES; i++) {
            String message = GenerateMessageUtil.getMessage();

            LOG.info(message);
        }
        
        SpringApplication.exit(context);
    }


}
