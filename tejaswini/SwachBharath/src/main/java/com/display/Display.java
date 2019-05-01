package com.display;

import java.util.Scanner;

import com.SwachBharath.App;
import com.SwachBharath.exceptions.Detailsnotfound;
import com.beans.UserDetails;
import com.beans.WasteDetails;

public class Display {
Scanner s= new Scanner(System.in);
UserDetails details= new UserDetails();
WasteDetails details1= new WasteDetails();
App app = new App();
int choice,choice2,choice3;

public void display1() throws Detailsnotfound
{
	System.out.println("enter your choice 1. Register 2.Login 3. exit");
	choice= s.nextInt();
	switch(choice)
	{
	case 1:register();
	
	 break;
	case 2:
		break;
	case 3:System.exit(0);
	}
}
public void register() throws Detailsnotfound
{
	System.out.println("enter your name");
	details.setName(s.next());
	System.out.println("enter mobile");
	details.setMobile(s.next());
	System.out.println("enter email");
	details.setEmail(s.next());
	System.out.println("enter password");
	details.setPassword(s.next());
	 details=app.register(details);
	 System.out.println("registration is done successfully and your credentials are "+details.getName()+" "+details.getMobile()+" "+details.getEmail()+" "+details.getPassword());
		System.out.println("do you want to continnue registration");
		System.out.println("if yes  enter 1 for registration , login enter 2,else enter 3");
		choice2=s.nextInt();
		switch(choice2)
		{
		case 1:register(); break;
		case 2:login();break;
		case 3:System.exit(0);
		}
}
public void login() throws Detailsnotfound
{
	System.out.println("enter email id");
	String mail=s.next();
	//details.setEmail(s.next());
	System.out.println("enter password");
	//details.setPassword(s.next());
	String password=s.next();

	details=app.login(mail,password);
	if(details != null)
	{
login2();		

	}
}
public void login2() {
	details1=app.waste(wasteDetails());
	 System.out.println("type is "+details1.getType());
	 System.out.println("weight in gms"+details1.getGrams());
	
	 System.out.println("brand is"+details1.getBrand());
	 System.out.println("obtained points "+ " "+details1.getPoints());
	  System.out.println("if you want to continue enter 1");
	 choice3=s.nextInt();
	 switch(choice3) {
	 case 1:login2();
	 break;
	 default: System.exit(0);
	 }

}
private WasteDetails wasteDetails() {
System.out.println("enter type of waste either plastic ,metal, glass");	
details1.setType(s.next());
System.out.println("enter weight in grams");
details1.setGrams(s.nextInt());
System.out.println("enter brand");
details1.setBrand(s.next());
return details1;
}
public static void main(String args[]) throws Detailsnotfound
{
	Display display = new Display();
	display.display1();
}
}