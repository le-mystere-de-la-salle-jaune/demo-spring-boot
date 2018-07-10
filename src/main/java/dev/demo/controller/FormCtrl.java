package dev.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dev.demo.Employe;

@Controller

public class FormCtrl {

	@GetMapping("/form1")
	public ModelAndView form1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("form1");
		return mv;
	}

	@PostMapping("/form1")
	public ModelAndView postForm1(@RequestParam String nom, @RequestParam String prenom) {
		System.out.println("nom=" + nom + " prenom=" + prenom);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("form1");
		return mv;
	}

	// @RequestMapping(method = RequestMethod.GET, path = "/form1")
	@GetMapping("/form2")
	public ModelAndView form2() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employe", new Employe("A", "B"));
		mv.setViewName("form2");
		return mv;
	}

	@PostMapping("/form2")
	public ModelAndView postForm2(@ModelAttribute("employe") @Valid Employe employe, BindingResult result) {
		System.out.println("nom=" + employe.getNom() + " prenom=" + employe.getPrenom());
		System.out.println("Erreur ? =" + result.hasErrors());

		ModelAndView mv = new ModelAndView();
		employe.setNom("A=>" + employe.getNom());
		mv.addObject("employe", employe);
		mv.setViewName("form2");
		return mv;
	}

}
