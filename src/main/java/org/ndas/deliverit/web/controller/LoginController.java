package org.ndas.deliverit.web.controller;

import java.util.Enumeration;

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
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("login", new LoginForm());
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginProcess(@ModelAttribute LoginForm login, ModelAndView model, HttpSession session) {
		model.setViewName("jobList");
		UserModel user = new UserModel(login.getEmailAddress());
		user.setFirstName("Sharuyr");
		model.addObject("user", user);
		return "redirect:jobList";
	}
	
	@RequestMapping(value="logout", method=RequestMethod.POST)
	public String logout(HttpSession s) {
		Enumeration<String> attrNames = s.getAttributeNames();
		for (;attrNames.hasMoreElements();) {
			String attrName = attrNames.nextElement();
			s.removeAttribute(attrName);
		}
		s.invalidate();
		return "redirect:login";
	}
}
