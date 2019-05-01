package com.SwachBharath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.beans.UserDetails;
import com.beans.WasteDetails;

public class App 
{
	UserDetails detailsIt= new UserDetails();
	WasteDetails details1= new WasteDetails();
	List<String> list= new ArrayList<String>();
	int count=0;
	
	public UserDetails register(UserDetails details)
	{
		
		
		list.add(details.getEmail());
		
		list.add(details.getMobile());

		list.add(details.getName());

		list.add(details.getPassword());

		
		return details;
	}
	
	
	public UserDetails login(UserDetails details) {
		for(String detailsIt: list)
		{
		
			if(details.getEmail().equals(detailsIt))
			{
				int i=list.indexOf(detailsIt);
				//for(int j=0;j<=i;j++)
			//	{
				if(details.getPassword().equals(list.get(i+3)))
				{
					//System.out.println("yes");
					 count=1;	
				}
			//	}
					
			}
			
			
		}
		if(count==1)
		{
		return details;
		}
		else
		{
			return null;
		}
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
    
}
