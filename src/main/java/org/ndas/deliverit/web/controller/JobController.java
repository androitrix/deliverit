package org.ndas.deliverit.web.controller;

import org.ndas.deliverit.persistence.Job;
import org.ndas.deliverit.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobController extends AbstractController {
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping(value ="jobs", method=RequestMethod.GET)
	public ModelAndView jobs() {
		System.out.println("Getting jobs");
		ModelAndView m = new ModelAndView();
		m.addObject("jobs", jobService.getAllJobs());
		m.setViewName("jobList");
		return m;
	}
	
	@RequestMapping(value = "job/{id}", method=RequestMethod.GET)
	public ModelAndView job(@PathVariable("id") Long id, ModelAndView mv) {
		Job j = jobService.getJob(id);
		mv.addObject("job", j);
		mv.setViewName("job");
		return mv;
		
	}
	
	@RequestMapping(value ="job/new", method=RequestMethod.GET)
	public String create(Model m) {
		m.addAttribute("job", new Job());
		return "job";
	}
	
	@RequestMapping(value ="job/create", method=RequestMethod.POST)
	public ModelAndView processCreate(@ModelAttribute Job job, ModelAndView m) {
		jobService.createJob(job);
		m.addObject("jobs", jobService.getAllJobs());
		m.setViewName("jobList");
		return m;
	}
 
}
