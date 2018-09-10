package cc.kpug.cloudnative.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

    public static void main(String[] args) {
        // http://localhost:8888/configuration-client.properties
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }
}
