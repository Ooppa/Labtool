package fi.javalabra.labtool.application;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fi.javalabra.labtool.repository.CourseRepository;

/**
 * Spring-boot initializer.
 */
@SpringBootApplication
@ComponentScan("fi.javalabra.labtool")
@EnableJpaRepositories("fi.javalabra.labtool.repository")
public class LabtoolApplication {
    
    /**
    * Main-method.
    * @param args command line args
    */
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(LabtoolApplication.class, args);
    }
    
}
