package org.ndas.deliverit.model;

public class GeoCoordinate {

	private Double latitude = Double.NaN;
	
	private Double longitude = Double.NaN;
	
	private Double altitude;
	
	private Double speed;
	
	private Double courseHeading;
	
	private Double horizontalAccuracy;
	
	private Double vericalAccuracy;

	
	/**
	 * 
	 */
	public GeoCoordinate() {
		super();
	}

	/**
	 * @param latitude
	 * @param longitude
	 */
	public GeoCoordinate(Double latitude, Double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * @param latitude
	 * @param longitude
	 * @param altitude
	 * @param speed
	 * @param courseHeading
	 * @param horizontalAccuracy
	 * @param vericalAccuracy
	 */
	public GeoCoordinate(Double latitude, Double longitude, Double altitude,
			Double speed, Double courseHeading, Double horizontalAccuracy,
			Double vericalAccuracy) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.speed = speed;
		this.courseHeading = courseHeading;
		this.horizontalAccuracy = horizontalAccuracy;
		this.vericalAccuracy = vericalAccuracy;
	}

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the altitude
	 */
	public Double getAltitude() {
		return altitude;
	}

	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	/**
	 * @return the speed
	 */
	public Double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	/**
	 * @return the courseHeading
	 */
	public Double getCourseHeading() {
		return courseHeading;
	}

	/**
	 * @param courseHeading the courseHeading to set
	 */
	public void setCourseHeading(Double courseHeading) {
		this.courseHeading = courseHeading;
	}

	/**
	 * @return the horizontalAccuracy
	 */
	public Double getHorizontalAccuracy() {
		return horizontalAccuracy;
	}

	/**
	 * @param horizontalAccuracy the horizontalAccuracy to set
	 */
	public void setHorizontalAccuracy(Double horizontalAccuracy) {
		this.horizontalAccuracy = horizontalAccuracy;
	}

	/**
	 * @return the vericalAccuracy
	 */
	public Double getVericalAccuracy() {
		return vericalAccuracy;
	}

	/**
	 * @param vericalAccuracy the vericalAccuracy to set
	 */
	public void setVericalAccuracy(Double vericalAccuracy) {
		this.vericalAccuracy = vericalAccuracy;
	}
	
	/**
	 * if this geocode is unknown
	 * @return
	 */
	public boolean isUnknown() {
		return !(this.latitude >= -180 && this.latitude <= 180
				&& this.longitude >= -180 && this.longitude <= 180);
	}
	
}
