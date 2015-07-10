package org.ndas.deliverit.service;

import java.util.List;

import org.ndas.deliverit.data.Job;

public interface JobService {

	public List<Job> getAllJobs();
	
	public Job createJob(Job j);
}
