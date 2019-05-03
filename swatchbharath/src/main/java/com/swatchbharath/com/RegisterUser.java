package com.swatchbharath.com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegisterUser {

    public static int users = 0;
    private String mUsername;
    private String mEmail;
    private String mMobileNumber;
    private int id;
    private Scanner mScanner;

    private OnRegisterUserListener registrationListener;

    public interface OnRegisterUserListener {
        public void OnRegistationComplete(String userName, String email, String mobileNumber, int id);

        public void OnRegistrationAborted();
    }

    public RegisterUser(OnRegisterUserListener listener, Scanner scanner) {
        mUsername = null;
        mEmail = null;
        mMobileNumber = null;
        id = ++users;
        this.registrationListener = listener;
        this.mScanner = scanner;
    }

    public void displayRegistrationMenu() {
        getUserName();
        getUserEmail();
        getUserMobile();
        System.out.println("User registration success full!!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.registrationListener.OnRegistationComplete(this.mUsername, this.mEmail, this.mMobileNumber, this.id);

    }

    private void getUserName() {
        Scanner inputReader = this.mScanner;
        Util.clearScreen();
        System.out.print("Enter your name : ");
        String userName = inputReader.nextLine();
        if (userName != null && userName != "") {
            mUsername = userName;
        } else {
            System.out.println("\nInvalid Username!!");
            Util.sleep(1500);
            getUserName();
        }
    }

    private void getUserEmail() {
        Scanner inputReader = this.mScanner;
        Util.clearScreen();
        System.out.print("Enter your email id : ");
        String emailId = inputReader.nextLine();
        if (Pattern.matches("^(.+)@(.+)$", emailId)) {
            mEmail = emailId;
        } else {
            System.out.println("\nInvalid email Id");
            Util.sleep(1500);
            getUserEmail();
        }
    }

    private void getUserMobile() {
        Scanner inputReader = this.mScanner;
        Util.clearScreen();
        System.out.print("Enter your mobile number: ");
        String mobile = inputReader.nextLine();
        if (Pattern.matches("[d{10}]", mobile)) {
            mMobileNumber = mobile;
        } else {
            System.out.println("\nInvalid mobile number");
            Util.sleep(1500);
            getUserMobile();
        }
    }

}