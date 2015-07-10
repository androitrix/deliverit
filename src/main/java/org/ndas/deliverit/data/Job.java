package org.ndas.deliverit.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "job_type")
	private String jobType;
	
	@Column(name = "when_commitment_start")
	private Date whenCommitmentStart;
	
	@Column(name = "when_commitment_end")
	private Date whenCommitmentEnd;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the jobType
	 */
	public String getJobType() {
		return jobType;
	}

	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	/**
	 * @return the commitmentStart
	 */
	public Date getWhenCommitmentStart() {
		return whenCommitmentStart;
	}

	/**
	 * @param commitmentStart the commitmentStart to set
	 */
	public void setWhenCommitmentStart(Date commitmentStart) {
		this.whenCommitmentStart = commitmentStart;
	}

	/**
	 * @return the commitmentEnd
	 */
	public Date getWhenCommitmentEnd() {
		return whenCommitmentEnd;
	}

	/**
	 * @param commitmentEnd the commitmentEnd to set
	 */
	public void setWhenCommitmentEnd(Date commitmentEnd) {
		this.whenCommitmentEnd = commitmentEnd;
	}
	
}
