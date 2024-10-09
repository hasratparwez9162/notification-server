package com.bank.app.consumer;




import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AccountEventConsumer {
//    @KafkaListener(topics = "account-service-topic", groupId = "bank-app")
//    public void consumeAccountEvent(ConsumerRecord<String, AccountNotification> record) {
//        String key = record.key();
//        AccountNotification account = record.value();
//        System.out.println("Consume Account Message - Key: " + key + ", Data: " + account);
//    }
//
//    @KafkaListener(topics = "transaction-service-topic", groupId = "bank-app")
//    public void consumeTransactionEvent(ConsumerRecord<String, TransactionRequest> record) {
//        String key = record.key();
//        TransactionRequest transactionRequest = record.value();
//        System.out.println("Consume Transaction Message - Key: " + key + ", Data: " + transactionRequest);
//    }
}
