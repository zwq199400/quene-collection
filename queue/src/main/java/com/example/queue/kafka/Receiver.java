package com.example.queue.kafka;

import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author zwq
 * @date 2018/12/28 16:41
 */
//@Component
public class Receiver {

    @KafkaListener(topics = "test1")
    public void processMessage(String content) {
        System.out.println(content);
    }
}
