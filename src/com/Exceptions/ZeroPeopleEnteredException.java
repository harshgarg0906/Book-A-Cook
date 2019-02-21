package com.Exceptions;

public class ZeroPeopleEnteredException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public ZeroPeopleEnteredException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ZeroPeopleEnteredException [msg=" + msg + "]";
	}
	
	
}
