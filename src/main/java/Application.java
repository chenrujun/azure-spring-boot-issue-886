import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.azure.spring.cloud.autoconfigure.jms.ServiceBusJmsAutoConfiguration;

@SpringBootApplication(exclude = ServiceBusJmsAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}