package com.tvd12.properties.file;

public class PropertiesFileException extends Exception {
	private static final long serialVersionUID = -2357054884838061118L;

	/**
	 * constructor
	 * 
	 * @param msg message
	 */
	public PropertiesFileException(String msg) {
		super(msg);
	}
	
	/**
	 * constructor
	 * 
	 * @param msg message
	 * @param cause exception
	 */
	public PropertiesFileException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}