package org.ndas.deliverit.model;

import java.util.Date;

public class Job {

	public static final Job DEFAULT_JOB = new Job(
			"New",
			"Default", 
			"Tom Clancy", 
			new Date(), 
			new Date(),
			"19 Newton Rd",
			"Newton",
			"Auckland",
			"Worker 1");
	
	private String status;
	private String type;
	private String customerName;
	private Date commitmentStart;
	private Date commitmentEnd;
	private String street;
	private String address2;
	private String city;
	private String fieldDevice;
	
	
	public Job(String status, String type, String customerName,
			Date commitmentStart, Date commitmentEnd, String street,
			String address2, String city, String fieldDevice) {
		super();
		this.status = status;
		this.type = type;
		this.customerName = customerName;
		this.commitmentStart = commitmentStart;
		this.commitmentEnd = commitmentEnd;
		this.street = street;
		this.address2 = address2;
		this.city = city;
		this.fieldDevice = fieldDevice;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the fieldDevice
	 */
	public String getFieldDevice() {
		return fieldDevice;
	}
	/**
	 * @param fieldDevice the fieldDevice to set
	 */
	public void setFieldDevice(String fieldDevice) {
		this.fieldDevice = fieldDevice;
	}

	
}
