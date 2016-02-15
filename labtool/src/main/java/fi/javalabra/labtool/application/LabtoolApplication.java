package fi.javalabra.labtool.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring-boot initializer.
 */
@SpringBootApplication
@ComponentScan("fi.javalabra.labtool")
public class LabtoolApplication {
    
    /**
    * Main-method.
    * @param args command line args
    */
    public static void main(String[] args) {
        SpringApplication.run(LabtoolApplication.class, args);
    }
    
}
