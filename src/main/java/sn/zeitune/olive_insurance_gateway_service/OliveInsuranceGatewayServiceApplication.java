package sn.zeitune.olive_insurance_gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class OliveInsuranceGatewayServiceApplication {

    @GetMapping
    public String home() {
        return "Welcome to Olive Insurance Gateway Service!";
    }

    public static void main(String[] args) {
        SpringApplication.run(OliveInsuranceGatewayServiceApplication.class, args);
    }

}
