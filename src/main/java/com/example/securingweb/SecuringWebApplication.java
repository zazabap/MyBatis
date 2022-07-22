package com.example.securingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@SpringBootApplication

public class SecuringWebApplication {

    // Spring Boot Dependency with OAuth2
    // https://spring.io/guides/tutorials/spring-boot-oauth2/
    //

    // App Authentification ID and Code
    // 4197cf6adcf46baa56d8
    // 3cd5ef4c70931fbe330479a1a3055844981f204b
    @GetMapping("/loginGithub")
    public String MessageCall(Principal principal){
        return "Hi " + principal.getName() + "welcome to securingweb Applicaiton";
    }


    public static void main(String[] args) throws Throwable {
        SpringApplication.run(SecuringWebApplication.class, args);
    }

}