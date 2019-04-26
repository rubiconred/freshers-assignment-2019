package swachhbharat.vishal;

import java.io.*;
import java.util.*;
//import javax.swing.text.html.HTMLDocument.Iterator;

class Item{  
	
    
  }  

public class App 
{
	public static Scanner x;
	int itemno;  
    String name;  
    int qty;
    int cap;
    
    //Scanner scan = new java.util.Scanner(System.in);
    App(int itemno,String name,int qty,int cap){  
    
     this.itemno=itemno;  
     this.name=name;
     x = new java.util.Scanner(System.in);
     System.out.println("Enter number of "+name);
     this.qty=x.nextInt();
     System.out.println("Enter the capacity of "+name+" in ml");
     this.cap=x.nextInt();
     
 
     //x.close();
     
    }  

    public static void main( String[] args )
    {
    	//Scanner sc = new Scanner(System.in);
    	//System.out.println("Login \nUsername, Password & Phonenumber");
    	String username=args[0];
    	String password=args[1];
    	String phone=args[2];
    	String filepath="/home/vishal/git/freshers-assignment-2019/vishal/src/main/java/swachhbharat/vishal/members.txt";
    	//sc.close();
    	
    	if(verifyLogin(username,password,phone,filepath))
    	{
    		System.out.println("Welcome "+username+"\nEnter item details you wish to recycle\n");
    		//System.out.println("1.Generic\n2.Specific\n");
    		App i1=new App(1,"Plastic bottles",0,0);  
    		App i2=new App(2,"Plastic cups",0,0);  
    		App i3=new App(3,"Glasses",0,0);  
    		ArrayList<App> al=new ArrayList<App>();  
    		al.add(i1);  
    		al.add(i2);  
    		al.add(i3);  
    		  
    		java.util.Iterator<App> iterator=al.iterator();  
    		  
    		while(iterator.hasNext())
    		{  
    		    App it=(App)iterator.next();  
    		    System.out.println(it.itemno+" "+it.name+" "+it.qty+" "+it.cap);  
    		}
    	}
    	else
    		System.out.println("User not found");
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

