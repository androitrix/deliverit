package org.ndas.deliverit.web.controller;

import javax.servlet.http.HttpSession;

import org.ndas.deliverit.model.UserModel;
import org.ndas.deliverit.web.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	private UserS
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("login", new LoginForm());
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute LoginForm login, ModelAndView model, HttpSession session) {
		model.setViewName("jobList");
		UserModel user = new UserModel(login.getEmailAddress());
		user.setFirstName("Sharuyr");
		model.addObject("user", user);
		return model;
	}
}
