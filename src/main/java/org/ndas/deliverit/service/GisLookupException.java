package org.ndas.deliverit.service;

public class GisLookupException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 490929297986150742L;
	
	private String errorCode;

	/**
	 * @param errorCode
	 */
	public GisLookupException(String errorCode) {
		super();
		this.setErrorCode(errorCode);
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
