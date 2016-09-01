package com.kame.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/9/1 0001.
 */
@Controller
@SpringBootApplication
public class SampleController {


    @ResponseBody
    @RequestMapping("/")
    String hell0(){
        return "hello";
    }

    public static void main(String[] args){
        SpringApplication.run(SampleController.class,args);
    }


}
