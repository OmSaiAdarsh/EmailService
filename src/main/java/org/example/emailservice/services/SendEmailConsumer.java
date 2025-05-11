package org.example.emailservice.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SendEmailConsumer {
    @KafkaListener(topics = "sendEmail", groupId = "emailService")
    public void sendMail(String message){
        System.out.println(message);
    }
}
