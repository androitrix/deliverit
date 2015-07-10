package org.ndas.deliverit.web.form;

import java.util.Date;

public class JobForm {
	
	private String description;
	
	private String jobType;
	
	private Date commitmentStart;
	
	private Date commitmentEnd;

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
	public Date getCommitmentStart() {
		return commitmentStart;
	}

	/**
	 * @param commitmentStart the commitmentStart to set
	 */
	public void setCommitmentStart(Date commitmentStart) {
		this.commitmentStart = commitmentStart;
	}

	/**
	 * @return the commitmentEnd
	 */
	public Date getCommitmentEnd() {
		return commitmentEnd;
	}

	/**
	 * @param commitmentEnd the commitmentEnd to set
	 */
	public void setCommitmentEnd(Date commitmentEnd) {
		this.commitmentEnd = commitmentEnd;
	}

}
