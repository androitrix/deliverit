package org.ndas.deliverit.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="job")
public class Job extends IdentityEntity {
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "job_type")
	private String jobType;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "when_commitment_start")
	private Date whenCommitmentStart;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "when_commitment_end")
	private Date whenCommitmentEnd;

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
