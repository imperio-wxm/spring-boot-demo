package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wxmimperio on 2017/5/14.
 */
@SpringBootApplication
public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        LOG.info("Use log4j!");
        SpringApplication.run(Application.class, args);
    }
}
