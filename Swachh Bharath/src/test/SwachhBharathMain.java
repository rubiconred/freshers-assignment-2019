package test;

import java.util.Scanner;

public class SwachhBharathMain {
	static Scanner sc = new Scanner(System.in);
	static int ch;
	static Wastage w=null;
	static User u=null;
	
	public static void main(String[] args) {
		
		System.out.println("<<<<------SWACHH BHARATH------>>>>");
		while (true) {
			System.out.println("Please Choose Option");
			System.out.println("1.Register");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				register();
				wasteMaterial();
				report();
				break;
				
			default:
				System.out.println("Please Choose Valid Option");
			}
		}

	}

	
	
	
	
	private static void report() {
		System.out.println("<<<----REPORTS---->>>");
		System.out.println("<----User Details---->");
		System.out.println("User Name	:	"+u.getUserName());
		System.out.println("Email		:	"+u.getEmail());
		System.out.println("Contact No	:	"+u.getContactNo());
		System.out.println("<----Waste Details---->");
		System.out.println("Type 		:	"+w.getType());
		System.out.println("Quantity	:	"+w.getQuantity());
		System.out.println("Brand		:	"+w.getBrand());
		System.out.println("Points		:	"+w.getPoints());
	}





	private static void wasteMaterial() {
		w=new Wastage();
		System.out.println("Select Type Of Wastage");
		System.out.println("1.Plastic\n2.Metal\n3.Glass");
		ch=sc.nextInt();
		if(ch==1 || ch==2 || ch==3)
		{
			System.out.println("Enter Quantity");
			w.setQuantity(sc.nextInt());
			if(ch==1)w.setType("Plastic");
			if(ch==2)w.setType("Metal");
			if(ch==3)w.setType("Glass");
			System.out.println("Enter Brand");
			w.setBrand(sc.next());
			w.setPoints(Math.abs(w.getQuantity()/2));
		}
		else
		{
			System.out.println("Wrong choose..Please try again..");
		}
		
		
	}





	private static void register() {
		u=new User();
		System.out.println("Enter Name	:");
		u.setUserName(sc.next());
		System.out.println("Enter Email	:");
		u.setEmail(sc.next());
		System.out.println("Enter Contact No:");
		u.setContactNo(sc.next());
		System.out.println(u);
	}

}
