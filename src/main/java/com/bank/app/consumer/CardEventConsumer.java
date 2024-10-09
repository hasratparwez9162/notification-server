package com.bank.app.consumer;

//import com.bank.core.entity.CardNotification;
import com.bank.core.entity.CardNotification;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class CardEventConsumer {


    @KafkaListener(topics = "card-service-topic",groupId = "bank-app")
    public void consumeEvents(ConsumerRecord<String, CardNotification> record) {
        System.out.println(record.key() +": "+ record.value().toString());
    }
}

