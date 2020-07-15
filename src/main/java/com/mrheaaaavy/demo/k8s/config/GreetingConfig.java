package com.mrheaaaavy.demo.k8s.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mrheaaaavy
 */
@Data
@Configuration
@ConfigurationProperties("greeting")
public class GreetingConfig {
    private String message;
}
