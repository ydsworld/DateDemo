package com.ydsworld.controller;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value="/")
	public String helloSpringBoot(){
		
		DateTime today = new DateTime().withTimeAtStartOfDay();
		Date todayDate = today.toDate();
		
		System.out.println(today);
		System.out.println(todayDate);
		
		return "Hello Spring Boot";
	}
	
}
