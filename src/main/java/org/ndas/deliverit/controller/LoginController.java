package org.ndas.deliverit.controller;

import org.ndas.deliverit.form.LoginForm;
import org.ndas.deliverit.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("login", new LoginForm());
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute LoginForm login, ModelAndView model) {
		model.setViewName("home");
		User user = new User(login.getEmailAddress());
		user.setFirstName("Sharuyr");
		model.addObject("user", user);
		return model;
	}
}
