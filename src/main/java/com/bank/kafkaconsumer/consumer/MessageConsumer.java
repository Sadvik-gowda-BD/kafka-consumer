package com.bank.kafkaconsumer.consumer;

import com.bank.kafkaconsumer.dto.StudentDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    private static final String topic1 = "my-topic-1";

    @KafkaListener(topics = topic1)
    public void consume(StudentDto dto){
        System.out.println("Consumed message :"+dto);
        System.out.println("Consumed message :"+dto.getName());
    }

    //each consumer assign to different partition
//    @KafkaListener(topics = topic1)
//    public void consumer2(String message){
//        System.out.println("Consumed message met1 :"+message);
//    }

//    @KafkaListener(topics = topic1, groupId = "group2")
//    public void consumerWithGp2Latest(String message){
//        System.out.println("Consumed message met2 earliest:"+message);
//    }


    //    @KafkaListener(topics = topic1)
//    public void consumer4(String message){
//        System.out.println("Consumed message :"+message);
//    }



//    @KafkaListener(topics = userEventTopic)
//    public void consumerUserEvents(ConsumerRecord<String,String> consumerRecord){
//        log.info("************************");
//        log.info("Consumed message - key:{} ,value:{}",consumerRecord.key(), consumerRecord.value());
//
//    }
}
