package dev.demo.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoCtrl {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	// @ResponseBody
	public String hello(HttpServletRequest req) {
		return "hello";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/hello/{id}")
	@ResponseBody
	public String helloId(@PathVariable Integer id, @RequestParam Optional<String> text) {
		return "hello id=" + id + " text=" + text;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/hello2")
	public String helloId(Model model) {

		model.addAttribute("text", "Un super texte écrit depuis mon contrôleur");

		return "hello2";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/hello3")
	public ModelAndView hello3() {

		ModelAndView mv = new ModelAndView();

		mv.addObject("text", "[VERSION 3] Un super texte écrit depuis mon contrôleur");

		mv.setViewName("hello2");

		return mv;
	}
}
