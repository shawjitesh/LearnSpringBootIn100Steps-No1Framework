package com.example.springboot.web.springbootfirstwebapplication.controller;

import com.example.springboot.web.springbootfirstwebapplication.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodosList(ModelMap model) {
		model.put("todos", todoService.retrieveTodos("jitesh"));
		return "list-todos";
	}
}
