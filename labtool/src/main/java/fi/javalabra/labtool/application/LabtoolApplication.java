package fi.javalabra.labtool.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Ooppa
 */
@SpringBootApplication
@ComponentScan("fi.javalabra.labtool")
public class LabtoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabtoolApplication.class, args);
    }
    
}
