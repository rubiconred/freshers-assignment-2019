package swachhbharat.vishal;

import java.io.*;
import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class App 
{
	public static Scanner x;
	int itemno;  
    String name;  
    int qty;
    int cap;
    double wt;
    
    
    App(int itemno,String name,int qty,int cap,double wt)
    {  
      this.itemno=itemno;  
      this.name=name;
      x = new java.util.Scanner(System.in);
      System.out.println("Enter number of "+name);
      this.qty=x.nextInt();
      System.out.println("Enter the capacity of "+name+" in ml");
      this.cap=x.nextInt();
      this.wt=wt;
    }  

    public static void main( String[] args )
    {
    	String username=args[0];
    	String password=args[1];
    	String phone=args[2];
    	String filepath="/home/vishal/git/freshers-assignment-2019/vishal/src/main/java/swachhbharat/vishal/members.txt";
    	double tgrams=0;
    	
    	if(verifyLogin(username,password,phone,filepath))
    	{
    		System.out.println("Welcome "+username+"\nEnter item details you wish to recycle\n");
    		
 /*last parameter in constructor is weight of the material per ml capacity(1ml=?gm)
    Assuming:
    		1ml capacity plastic =0.02gms (500ml-10gms) 
    		1ml capacity glass =0.7gms (200ml-140gms)
    		1ml capacity metal cans =0.04gms (350ml=15gms)
 */
    		App i1=new App(1,"Plastic bottles",0,0,0.02);  
    		App i2=new App(2,"Glasses",0,0,0.7);  
    		App i3=new App(3,"Metal Cans",0,0,0.04);  
    		ArrayList<App> al=new ArrayList<App>();  
    		al.add(i1);  
    		al.add(i2);  
    		al.add(i3);  
    		java.util.Iterator<App> iterator=al.iterator();  
    		  
    		while(iterator.hasNext())
    		{  
    		    App it=(App)iterator.next();  
    		    System.out.println(it.itemno+" "+it.name+" "+it.qty+" "+it.cap);
    		    tgrams+=it.qty*it.cap*it.wt;
    		}
    	System.out.println("Total amout of recycled items: "+tgrams+" gms");
 //Assuming that 10gms recycled product gives 7 credit points 
    	System.out.println("Total credits earned are: "+String.format("%.0f", tgrams*0.7));
    	System.out.println("Coupon Code to redeem your credits is: "+givenUsingApache_whenGeneratingRandomAlphanumericString_thenCorrect());
    	}
    	else
    		System.out.println("User not found");
    }
    
    @Test
    public static String givenUsingApache_whenGeneratingRandomAlphanumericString_thenCorrect() {
        String generatedString = RandomStringUtils.randomAlphanumeric(7);
     
        return(generatedString);
    }
        
    
    public static boolean verifyLogin(String username,String password,String phone,String filepath)
    {
    	boolean found=false;
    	String tempUsername="";
    	String tempPassword="";
    	String tempPhone="";
    	try
    	{
    		x=new Scanner(new File(filepath));
    		x.useDelimiter("[,\n]");
    		
    		while(x.hasNext() && !found)
    		{
    			tempUsername=x.next();
    			tempPassword=x.next();
    			tempPhone=x.next();
    			
    			if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()) && tempPhone.trim().equals(phone.trim())) 
    			{
    				found=true;
    			}
    		
    		}
    		x.close();
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    return found;
    }
}

