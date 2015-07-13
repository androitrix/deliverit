package org.ndas.deliverit.web.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.ndas.deliverit.persistence.User;
import org.ndas.deliverit.service.UserService;
import org.ndas.deliverit.web.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("login", new LoginForm());
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginProcess(@ModelAttribute LoginForm login,
			ModelAndView model, HttpSession session) {
		List<User> users = this.userService.findByUsernameAndPassword(
				login.getEmailAddress(), login.getPassword());

		if (users.size() == 0) {
			model.addObject("error", "User name or password invalid");
			return "login";
		}

		if (users.size() == 1) {
			session.setAttribute("user", users.get(0));
			return "redirect:jobs";
		}
		throw new RuntimeException(
				"more than 1 user with specified username & password");
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession s) {
		Enumeration<String> attrNames = s.getAttributeNames();
		for (; attrNames.hasMoreElements();) {
			String attrName = attrNames.nextElement();
			s.removeAttribute(attrName);
		}
		s.invalidate();
		return "redirect:login";
	}
}
