package com.student.Student.Ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StudentAbApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAbApplication.class, args);
	}



}

