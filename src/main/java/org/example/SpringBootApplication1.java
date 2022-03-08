package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringBootApplication1 {
    public static void main(String args[]){
        SpringApplication.run(SpringBootApplication1.class, args);
    }
}
