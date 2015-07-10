package org.ndas.deliverit.web.controller;

import java.util.List;

import org.ndas.deliverit.data.Job;
import org.ndas.deliverit.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@ModelAttribute("jobs")
	public List<Job> allJobs() {
		System.out.println("Getting all jobs");
		return jobService.getAllJobs();
	}
	
	@RequestMapping(value ="jobs", method=RequestMethod.GET)
	public ModelAndView jobs() {
		System.out.println("Getting jobs");
		ModelAndView m = new ModelAndView();
		m.addObject("jobs", jobService.getAllJobs());
		m.setViewName("jobList");
		return m;
	}
	
	@RequestMapping(value ="job/create", method=RequestMethod.GET)
	public String create() {
		return "jobCreate";
	}
 
}
