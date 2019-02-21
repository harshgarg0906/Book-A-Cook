package com.Exceptions;

public class NoCooksAvailableException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public NoCooksAvailableException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NoCooksAvailableException [msg=" + msg + "]";
	}
	
}
