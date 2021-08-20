package com.example.restservice;

// 클라이언트에 반환 할 표현 클래스
// SpringBoot의 Web Starter Dependency에는 인스턴스(객체)를 JSON 형태로 변환해주는 Jackson JSON 라이브러리가 포함되어있음
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}