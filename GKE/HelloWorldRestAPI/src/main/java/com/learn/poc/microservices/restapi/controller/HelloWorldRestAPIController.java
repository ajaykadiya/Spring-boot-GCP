package com.learn.poc.microservices.restapi.controller;

import java.util.StringJoiner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldRestAPIController {
	//Logger log= Logger.

	private static final Logger log = LoggerFactory.getLogger(HelloWorldRestAPIController.class);
	@GetMapping("/Hello-World")
	public String getHelloWorldMessage()
	{
		//log.debug("Started getHelloWorldMessage().....");
		log.info(" *********** Started getHelloWorldMessage() *********** ");
		StringJoiner returnHelloWorldMessage= new StringJoiner("  ::  ");
		returnHelloWorldMessage.add("Hello World");
		returnHelloWorldMessage.add(java.time.LocalDateTime.now().toString());
		log.info("***********  End getHelloWorldMessage() *********** ");
		//log.debug("End getHelloWorldMessage().....");
		return ( returnHelloWorldMessage.toString());
	}
}
