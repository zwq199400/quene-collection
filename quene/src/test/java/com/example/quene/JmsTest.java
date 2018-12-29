package com.example.quene;

import com.example.quene.activeMQ.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author zwq
 * @date 2018/10/19 15:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsTest {
    @Autowired
    private MessageProducer messageProducer;

    @Test
    public void pubSubTest() throws InterruptedException {

        for(int i=0; i<100; i++){
            messageProducer.send();
        }
    }
}
