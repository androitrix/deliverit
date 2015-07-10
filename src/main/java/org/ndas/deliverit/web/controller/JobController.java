package org.ndas.deliverit.web.controller;

import java.util.List;

import org.ndas.deliverit.data.Job;
import org.ndas.deliverit.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String jobs(Model m) {
		System.out.println("Getting jobs");
		m.addAttribute("userName", "Priktick");
		return "jobList";
	}
 
}
