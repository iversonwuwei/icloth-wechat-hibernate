import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by walden on 2016/12/23.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.walden"})
@EnableJpaRepositories(basePackages = {"com.walden.repository"})
@EntityScan(basePackages = {"com.walden.model"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
