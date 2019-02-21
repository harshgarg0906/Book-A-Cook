package com.Services;

import java.util.ArrayList;

import com.Exceptions.NoCooksAvailableException;
import com.Exceptions.ZeroPeopleEnteredException;
import com.ServiceInterface.UserServicesInterface;

public class UserServices implements UserServicesInterface
{
	public ArrayList<String> getAvailableCooks(ArrayList<String> a)throws NoCooksAvailableException
	{
		ArrayList<String> b=new ArrayList<String>();
		String cooks;
		if(! a.isEmpty())
		{
			for(int j=0;j<a.size();j++)
			{
				cooks=(String) a.get(j);
				b.add(cooks);
			}
		}
		else
			{
				//throw new NoCooksAvailableException("no available cook as per search criteria!");
				
			}
		return b;
	}
	
	public float calculate(int ppl,int sal)throws ZeroPeopleEnteredException
	{
		float amt;
		if(ppl>0)
		{
			amt= ppl*sal;
			System.out.println(amt+"in service class claculate method");
			return amt;
		}
		else
			throw new ZeroPeopleEnteredException("no of ppl entered is zero!");
		
		
	}
	
}
