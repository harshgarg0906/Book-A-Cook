package com.ServiceInterface;

import java.util.ArrayList;

import com.Exceptions.NoCooksAvailableException;
import com.Exceptions.ZeroPeopleEnteredException;

public interface UserServicesInterface 
{
	public ArrayList<String> getAvailableCooks(ArrayList<String> a) throws NoCooksAvailableException;
	public float calculate(int ppl,int sal)throws ZeroPeopleEnteredException;
}
