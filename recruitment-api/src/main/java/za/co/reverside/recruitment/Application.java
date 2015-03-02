package za.co.reverside.recruitment;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@ComponentScan
@EnableAutoConfiguration
@ImportResource({"classpath:security-context.xml"})
@EnableSwagger
public class Application {

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}
