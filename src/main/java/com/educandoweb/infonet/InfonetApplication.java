package com.educandoweb.infonet;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfonetApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfonetApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		sc.close();
	}

}
