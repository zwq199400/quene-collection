package com.example.queue.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zwq
 * Controller
 * Created by zwq on 2018/3/9.
 */
@Controller
@EnableAutoConfiguration
public class TestController {


    @RequestMapping(value="/hello",method= RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "hello";
    }


}
