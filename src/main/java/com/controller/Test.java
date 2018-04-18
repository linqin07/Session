package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/test")
	public String test(HttpSession session, HttpServletRequest request) {
		request.setAttribute("id", session.getId());
		return "index";
	}

}
