package com.pluralsight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@Autowired
	private TaskProcessor taskProcessor;
	
	@PostMapping(value = "/tasks")
	public String launchTask(@RequestBody String s) {
		taskProcessor.publishRequest(s);
		
		System.out.println("request mode");
		
		return "success";
	}

}
