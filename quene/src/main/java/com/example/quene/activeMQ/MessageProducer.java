package com.example.quene.activeMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


/**
 * 点对点和订阅模式的消息发布
 * @author zwq
 * @date 2018/10/25 15:51
 */
@Component
@EnableScheduling
public class MessageProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private TopicConfig topicConfig;

    public void send() {
        //send activeMQ.
//        this.jmsMessagingTemplate.convertAndSend(topicConfig.activeMQ(), "hi,activeMQ(activeMQ)");
        //send topic.
        this.jmsMessagingTemplate.convertAndSend(topicConfig.topic(), "hi,activeMQ(topic)");
    }

}