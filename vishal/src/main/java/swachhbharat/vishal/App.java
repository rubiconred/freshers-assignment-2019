package swachhbharat.vishal;

import java.io.File;
import java.util.Scanner;

public class App 
{
	private static Scanner x;

    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Login \nUsername & Password ");
    	String username=sc.nextLine();
    	String password=sc.nextLine();
    	String filepath="/home/vishal/git/freshers-assignment-2019/vishal/src/main/java/swachhbharat/vishal/members.txt";
    	sc.close();
    	
    	if(verifyLogin(username,password,filepath))
    	{
    	
    			System.out.println("welcome \n Select items you wish to recycle\n");
    			System.out.println("1.Plastic\n2.Glass\n3.Metal");
    		
    	}
    		
    		else
    			System.out.println("User not found");
    	}
        
    
    public static boolean verifyLogin(String username,String password,String filepath)
    {
    	boolean found=false;
    	String tempUsername="";
    	String tempPassword="";
    	try
    	{
    		x=new Scanner(new File(filepath));
    		x.useDelimiter("[,\n]");
    		
    		while(x.hasNext() && !found)
    		{
    			tempUsername=x.next();
    			tempPassword=x.next();
    			
    			if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())) 
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

