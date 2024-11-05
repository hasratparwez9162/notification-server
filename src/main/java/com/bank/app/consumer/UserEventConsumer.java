package com.bank.app.consumer;

import com.bank.core.entity.AccountNotification;
import com.bank.core.entity.UserNotification;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class UserEventConsumer {

        @KafkaListener(topics = "user-service-topic", groupId = "bank-app")
        public void consumeAccountEvent(ConsumerRecord<String, UserNotification> record) {
            String key = record.key();
            UserNotification user = record.value();
            System.out.println("Consume User Message - Key: " + key + ", Data: " + user.toString());
        }
}
