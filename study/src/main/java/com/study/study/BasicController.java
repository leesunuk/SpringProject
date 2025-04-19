package com.study.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;


@Controller
class BasicController {
    @GetMapping("/")
    String start(){
    return "index.html" ;
    }

    @GetMapping("/about")
    @ResponseBody
    String about(){
        LocalDateTime now = LocalDateTime.now();
        return String.valueOf(now);
    }

    @GetMapping("/myPage")
    @ResponseBody
    String mine(){
        return "내가 만든 내 세상이야";
    }
}