package com.example.queue.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 点对点和订阅模式的消息发布
 * @author zwq
 * @date 2018/10/25 15:51
 */
//@Component
@EnableScheduling
public class MessageProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private TopicConfig topicConfig;

    public void send() {
        //send activemq.
//        this.jmsMessagingTemplate.convertAndSend(topicConfig.activemq(), "hi,activemq(activemq)");
        //send topic.
        this.jmsMessagingTemplate.convertAndSend(topicConfig.topic(), "hi,activemq(topic)");
    }

}