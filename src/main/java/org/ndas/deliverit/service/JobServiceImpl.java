package org.ndas.deliverit.service;

import java.util.List;

import org.ndas.deliverit.persistence.Job;
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
		List<Job> jobs = jobRepository.findAll();
		
		System.out.println("Returning " + jobs + " with length " + jobs.size());
		return jobs;
	}

	public Job createJob(Job j) {
		return jobRepository.save(j);
		
	}

}
