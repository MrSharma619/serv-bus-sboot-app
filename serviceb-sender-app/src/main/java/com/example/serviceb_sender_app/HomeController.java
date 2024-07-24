package com.example.serviceb_sender_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    private static final String QUEUE_NAME = "queue-notify";

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody Map<String, String> map){
        String message = map.get("message");

        jmsTemplate.convertAndSend(QUEUE_NAME, message);

        return new ResponseEntity<>("Message sent", HttpStatus.OK);

    }

}
