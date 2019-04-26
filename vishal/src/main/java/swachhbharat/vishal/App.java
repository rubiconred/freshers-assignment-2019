package swachhbharat.vishal;

import java.io.File;
import java.util.Scanner;

public class App 
{
	private static Scanner x;

    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Login \nUsername, Password & Phonenumber");
    	String username=sc.nextLine();
    	String password=sc.nextLine();
    	String phone=sc.nextLine();
    	String filepath="/home/vishal/git/freshers-assignment-2019/vishal/src/main/java/swachhbharat/vishal/members.txt";
    	sc.close();
    	
    	if(verifyLogin(username,password,phone,filepath))
    	{
    		System.out.println("Welcome"+username+ "\n Select items you wish to recycle\n");
    		System.out.println("1.Plastic\n2.Glass\n3.Metal");
    		
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

