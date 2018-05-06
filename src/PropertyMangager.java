/**********************************************************************************************
 * File Name: PropertyMangager.java
 * Copyright: Citigroup Private Bank Copyright (c) 2014
 * @author  : TATA Consultancy Services
 *  Modification Log
 *  ================
 *  Version 		Date        Author     CR #   Modification
 *  -------     ----        -----      ----   -------------
 *  0.0    10/30/2014      	TCS      		Initial Version
/**********************************************************************************************/


import java.util.Properties;

public class PropertyMangager {

	Properties properties;

	String configLocation;

	String propertyFileName;

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * @return the configLocation
	 */
	public String getConfigLocation() {
		return configLocation;
	}

	/**
	 * @param configLocation
	 *            the configLocation to set
	 */
	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

	/**
	 * @return the propertyFileName
	 */
	public String getPropertyFileName() {
		return propertyFileName;
	}

	/**
	 * @param propertyFileName
	 *            the propertyFileName to set
	 */
	public void setPropertyFileName(String propertyFileName) {
		this.propertyFileName = propertyFileName;
	}

	public String getProperty(String key) {
		return (properties != null) ? properties.getProperty(key) : null;
	}

	public void setProperty(String key, String value) {
		if (properties != null)
			properties.setProperty(key, value);

	}

}
