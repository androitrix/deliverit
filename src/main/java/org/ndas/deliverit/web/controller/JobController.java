package org.ndas.deliverit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobController {
	
	@RequestMapping(value ="jobs", method=RequestMethod.GET)
	public ModelAndView jobs() {
		return null;
	}
 
}
