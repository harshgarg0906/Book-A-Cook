package com.Exceptions;

public class InvalidUserException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public InvalidUserException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidUserException [msg=" + msg + "]";
	}
	
}
