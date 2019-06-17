package com.acme.metrics.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.acme.metrics.elk.util.MessageUtil;

@SpringBootApplication
public class ElkApplication {

    private static final Logger logger = LoggerFactory.getLogger(ElkApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ElkApplication.class, args);

        for (int i = 0; i < 100; i++) {
            String message = MessageUtil.INSTANCE.getMessage();

            logger.info(message);
        }
        SpringApplication.exit(context);
    }


}
