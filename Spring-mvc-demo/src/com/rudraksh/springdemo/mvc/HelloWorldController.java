package com.rudraksh.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showPage() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read form data and
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShouDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to upper caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		//read the request parameter from the HTML form
		//String theName = request.getParameter("studentName");
		
		//convert the data to upper caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hello! " + theName + " just chill!!";
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}

}
