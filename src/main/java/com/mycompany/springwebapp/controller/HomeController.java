package com.mycompany.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	//http://localhost:8080/springwebapp/
	@RequestMapping("/")
	public String index() {
		return "/index"; //xml에서 prefix, suffix 를 줘서 "/WEB-INF/views/index.jsp 이여야하는데 /index 로 줄임
	}
}
