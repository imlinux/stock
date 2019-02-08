package dsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author dong
 * @since 18-10-22
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableScheduling
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class);
    }
}
