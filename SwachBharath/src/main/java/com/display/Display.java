package com.display;

import java.util.Scanner;

import com.SwachBharath.App;
import com.beans.UserDetails;
import com.beans.WasteDetails;

public class Display {
Scanner scan= new Scanner(System.in);
UserDetails details= new UserDetails();
WasteDetails details1= new WasteDetails();
WasteDetails details2= new WasteDetails();

App app = new App();
int choice,choice2;

public void display1()
{
	System.out.println("enter your choice 1. Register 2.Login 3. exit");
	choice= scan.nextInt();
	switch(choice)
	{
	case 1:register();
	
	 break;
	case 2:
		break;
	case 3:System.exit(0);
	}
}
public UserDetails register()
{
	System.out.println("enter your name");
	details.setName(scan.next());
	System.out.println("enter mobile");
	details.setMobile(scan.next());
	System.out.println("enter email");
	details.setEmail(scan.next());
	System.out.println("enter password");
	details.setPassword(scan.next());
	 details=app.register(details);
	 
	 System.out.println("Registration is done successfully and your credentials are \nName:"+details.getName() +"\nMobile No:"+details.getMobile()+"\nEmail:"+details.getEmail()+"\nPassword:"+details.getPassword());
		System.out.println("Do you want to continue registration");
		System.out.println("if yes  enter 1 \nFor login Enter 2\nFor Exit Enter 3");
		choice2=scan.nextInt();
		switch(choice2)
		{
		case 1:register(); break;
		case 2:login();break;
		case 3:System.exit(0);
		}
		return details;
}
public void login()
{

	System.out.println("enter email id");
	details.setEmail(scan.next());
	System.out.println("enter password");
	details.setPassword(scan.next());
	
	details=app.login(details);
	if(details != null)
	{
		
		result();
	}
	else {
		System.out.println("Incorrect Email or Password ");
	}
	
}


public void result() {
	 details1=app.waste(wasteDetails());
	 System.out.println("type is "+details1.getType());
	 System.out.println("weight in gms"+details1.getGrams());
	
	 System.out.println("brand is"+details1.getBrand());
	 System.out.println("obtained points "+ " "+details1.getPoints());
	
}

private WasteDetails wasteDetails() {
System.out.println("enter type of waste either plastic ,metal, glass");	
details1.setType(scan.next());
System.out.println("enter weight in grams");
details1.setGrams(scan.nextInt());
System.out.println("enter brand");
details1.setBrand(scan.next());

return details1;
}
public static void main(String args[])
{
	Display display = new Display();
	display.display1();
}
}
