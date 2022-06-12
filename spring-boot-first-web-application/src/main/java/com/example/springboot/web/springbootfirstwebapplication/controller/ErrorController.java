package com.example.springboot.web.springbootfirstwebapplication.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {

	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleException(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", exception.getStackTrace());
		modelAndView.addObject("url", request.getRequestURL());
		modelAndView.setViewName("error");
		
		return modelAndView;
	}
}
