package za.co.reverside.recruitment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@ImportResource({"classpath:security-context.xml"})
public class Application {

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}
