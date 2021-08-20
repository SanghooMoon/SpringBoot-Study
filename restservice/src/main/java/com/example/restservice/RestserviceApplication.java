package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @SpringBootApplication : 다음을 모두 포함하는 어노테이션
// 1. @Configuration(@SpringBootConfiguration) : Bean 등록, 설정 등을 하는 파일임을 의미하는 어노테이션
// 2. @EnableAutoConfiguration : classPath 설정 및 bean 추가를 시작하도록 지시하는 어노테이션, 즉 1번에서 설정된 Bean들을 실제 스프링 컨테이너에 생성하는 역할
// 3. @ComponentScan : @Component 어노테이션을 가진 Bean들이나 @Controller 등 일부 어노테이션들의 Bean을 스캔하여 생성

@SpringBootApplication
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);
	}

}
