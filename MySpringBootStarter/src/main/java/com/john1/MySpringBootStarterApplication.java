package com.john1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.spring_boot_starter_hello.HelloService;

@SpringBootApplication
@RestController
public class MySpringBootStarterApplication {
	
	@Autowired
	private HelloService s;
	
	@RequestMapping("/hello")
	public String index() {
		return s.sayHello();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootStarterApplication.class, args);
	}

}
