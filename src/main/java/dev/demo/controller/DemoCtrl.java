package dev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoCtrl {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	// @ResponseBody
	public String hello() {
		return "hello";
	}

}
