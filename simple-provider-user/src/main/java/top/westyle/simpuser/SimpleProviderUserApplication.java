package top.westyle.simpuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProviderUserApplication.class, args);
    }

}
