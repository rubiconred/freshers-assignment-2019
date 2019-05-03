package com.swatchbharath.com;

import java.util.Scanner;

public class SubmitTrash {
    private Scanner mScanner;
    private Db mDb;
    private OnSubmitTrashListener onTrashListener;
    private String mEmail;
    private int mType;

    private double weigth;
    private int rewardPoints;

    public interface OnSubmitTrashListener {
        void onTrashSubmitted(Trash trash);

        void onNotRegisteredUser(String email);
    }

    public SubmitTrash(Scanner scanner, Db db, OnSubmitTrashListener listener) {
        this.mScanner = scanner;
        this.mDb = db;
        this.onTrashListener = listener;
    }

    public void displaySubmitTrash() {
        getEmail();
        getType();
    }

    public void getEmail() {
        Scanner scanner = this.mScanner;
        System.out.print("Enter your email id :");
        String email = scanner.nextLine();
        if (Util.isValidEmail(email)) {
            if (mDb.isUserExist(email)) {
                this.mEmail = email;
            } else {
                System.out.println("User not registered!");
                Util.sleep(1500);
                Util.clearScreen();
                this.onTrashListener.onNotRegisteredUser(email);
            }
        } else {
            System.out.println("Ivalid email id");
            Util.sleep(1500);
            Util.clearScreen();
            getEmail();
        }

    }

    public void getType() {
        System.out.println("1. Coke Tin");
        System.out.println("2. Coke glass bottle");
        System.out.print("Select trash type to deposit :");
        String choise_str = mScanner.next();
        try {
            int choise = Integer.parseInt(choise_str);
            if (choise < 3 && choise > 0) {
                this.mType = choise;
            } else {
                System.out.println("Invalid choise");
                Util.sleep(1500);
                getType();
            }
        } catch (Exception e) {
            System.out.println("Invalid choise");
            Util.sleep(1500);
            getType();
        }

    }

}