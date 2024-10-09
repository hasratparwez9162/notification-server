package com.bank.app.consumer;



import com.bank.core.entity.LoanNotification;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LoanEventConsumer {
    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "loan-service-topic", groupId = "bank-app")
    public void consumeLoanEvent( ConsumerRecord<String, LoanNotification> record) {
        String eventType = record.key();
        LoanNotification loanJson = record.value();
        System.out.println(eventType +" : " + loanJson.toString());
    }

}
