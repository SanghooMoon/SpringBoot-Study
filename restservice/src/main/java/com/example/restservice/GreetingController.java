package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController = @Controller + @ResponseBody 가 합쳐진 어노테이션
// @ResponseBody : 자바 객체를 HTTP 메시지 바디에 저장하여 전달합니다. (Greeting 객체가 HTTP 응답 메시지 Body에 적재)

// Greeting 객체(인스턴스)를 JSON으로 변환해야하는데, SpringBoot의 HTTP 메시지 변환기(Jackson2HttpMessageConverter) 지원 덕에 자동으로 변환
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}