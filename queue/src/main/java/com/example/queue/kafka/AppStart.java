package com.example.queue.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author zwq
 * @date 2018/12/28 16:43
 */
@SpringBootApplication
public class AppStart  {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext app = SpringApplication.run(AppStart.class, args);

        while(true){
            Sender sender = app.getBean(Sender.class);
            sender.sendMessage();
            Thread.sleep(500);
        }
    }

}
