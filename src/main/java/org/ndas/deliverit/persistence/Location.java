package org.ndas.deliverit.persistence;

import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.data.annotation.Persistent;

@Persistent
@Table(name = "location")
public class Location extends IdentityEntity {
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="street_number1")
	private String streetNumber1;
	
	@Column(name="street_number2")
	private String streetNumber2;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="street_suffix")
	private String streetSuffix;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="address3")
	private String address3;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="post_code")
	private String postCode;
	
	@Column(name="country")
	private String country;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the streetNumber1
	 */
	public String getStreetNumber1() {
		return streetNumber1;
	}

	/**
	 * @param streetNumber1 the streetNumber1 to set
	 */
	public void setStreetNumber1(String streetNumber1) {
		this.streetNumber1 = streetNumber1;
	}

	/**
	 * @return the streetNumber2
	 */
	public String getStreetNumber2() {
		return streetNumber2;
	}

	/**
	 * @param streetNumber2 the streetNumber2 to set
	 */
	public void setStreetNumber2(String streetNumber2) {
		this.streetNumber2 = streetNumber2;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the streetSuffix
	 */
	public String getStreetSuffix() {
		return streetSuffix;
	}

	/**
	 * @param streetSuffix the streetSuffix to set
	 */
	public void setStreetSuffix(String streetSuffix) {
		this.streetSuffix = streetSuffix;
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
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
