package fi.javalabra.labtool.application;

import fi.javalabra.labtool.domain.User;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fi.javalabra.labtool.repository.CourseRepository;
import fi.javalabra.labtool.services.UserService;

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
        addTestData(ctx);
    }
    
    private static void addTestData(ConfigurableApplicationContext ctx) {
        UserService service = ctx.getBean(UserService.class);
        service.addUser(new User("petteri", "punakuono@example.com", "0XXXXXXX"));
        service.addUser(new User("sanni", "sansan@example.com", "0XXXXXXX"));
    }
    
}
