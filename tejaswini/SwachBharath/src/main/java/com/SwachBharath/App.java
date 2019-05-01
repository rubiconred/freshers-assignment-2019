package com.SwachBharath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.SwachBharath.exceptions.Detailsnotfound;
import com.beans.UserDetails;
import com.beans.WasteDetails;

public class App 
{
	UserDetails details= new UserDetails();
	WasteDetails details1= new WasteDetails();
	List<UserDetails> list= new ArrayList<UserDetails>();
	int count=0;
	public UserDetails register(UserDetails details)
	{
		list.add(details);
		return details;
	}
	
	public WasteDetails waste(WasteDetails details1)
	{ 
		if(details1.getType().equals("plastic"))
			
		{
			if(details1.getGrams()<10 )
			{
				details1.setPoints(5);
			}
			else if(details1.getGrams()>10 && details1.getGrams()<50)
			{
				details1.setPoints(10);
			}
			else
			{
				details1.setPoints(20);
			}
		}
		if(details1.getType().equals("glass"))
		{
			if(details1.getGrams()<10 )
			{
			details1.setPoints(5);
		}
			if(details1.getGrams()>10 && details1.getGrams()<50)
			{
				details1.setPoints(10);
			}
			if(details1.getGrams()>50 && details1.getGrams()<100)
			{
				details1.setPoints(20);
			}
		}
		if(details1.getType().equals("metal"))
		{
			if(details1.getGrams()<10 )
			{
				details1.setPoints(5);
			}
			if(details1.getGrams()>10 && details1.getGrams()<50)
			{
				details1.setPoints(10);
			}
			if(details1.getGrams()>50 && details1.getGrams()<100)
			{
				details1.setPoints(20);
			}
		}
		return details1;
		
	}
	public UserDetails login(String mail, String password) throws Detailsnotfound {
		// TODO Auto-generated method stub
		for(UserDetails details: list)
		{
			if(details.getEmail().equals(mail)&& details.getPassword().equals(password))
			{
				 count=1;		
			}
			else
			{
				throw new Detailsnotfound("Details does not exist");
			}
		}
		if(count==1)
		{
		return details;
		}
		else
		{
			return null;
		}	}
	
}
