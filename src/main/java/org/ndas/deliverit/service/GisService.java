package org.ndas.deliverit.service;

import org.ndas.deliverit.model.GeoCoordinate;

public interface GisService {

	public GeoCoordinate getGeocoordinateForAddress(String address) throws GisLookupException;
	
	public String getAddressForGeocoordinate() throws GisLookupException;
}
