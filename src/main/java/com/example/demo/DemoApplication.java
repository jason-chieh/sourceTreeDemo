package com.example.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


//�ư�spring security���w�]�n�J���� 
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class,args);
	}
}