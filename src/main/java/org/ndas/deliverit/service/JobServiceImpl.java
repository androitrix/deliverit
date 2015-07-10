package org.ndas.deliverit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ndas.deliverit.data.Job;
import org.ndas.deliverit.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

	private JobRepository jobRepository;

	@Autowired
	public void setJobRepository(JobRepository jobRepository) {
		this.jobRepository = jobRepository;
	}
	
	public List<Job> getAllJobs() {
		List<Job> jobs = new ArrayList<Job>();
		for (Job it : jobRepository.findAll()) {
			jobs.add(it);
		}
		
		System.out.println("Returning " + jobs + " with length " + jobs.size());
		return jobs;
	}

	public Job createJob(Job j) {
		return jobRepository.save(j);
		
	}

}
