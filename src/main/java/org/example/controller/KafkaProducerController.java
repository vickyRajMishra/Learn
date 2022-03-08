package org.example.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.example.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public class KafkaProducerController {

    @Autowired
    KafkaTemplate<String, String > kafkaTemplate;

    @Autowired
    EmployeeDao employeeDao;

    @PostMapping("/postToKafka")
    public String produceToKafka(@RequestBody String data) throws Exception{
        kafkaTemplate.send("test", data);
        return "Success";
    }
}
