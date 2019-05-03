package com.swatchbharath.com;

import java.util.Scanner;

public class ViewCoupons {

    private Scanner mScanner;

    public ViewCoupons(Scanner scanner) {
        this.mScanner = scanner;
    }

    public void askUserEmail() {
        Util.clearScreen();
        System.out.print("Enter your email ID :");
        String email = mScanner.nextLine();
        if (email == null || email.isEmpty()) {
            System.out.println("Invalid email id entered");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            askUserEmail();
        } else {
            System.out.println("");
        }
    }
}
