package com.swatchbharath.com;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    private OnMenuOptionSelectedListener menuListener;
    private Scanner mScanner;

    public interface OnMenuOptionSelectedListener {
        void onMenuItemSelected(int menuId);

        void onInvalidMenuSelected();
    }

    public MainMenu(OnMenuOptionSelectedListener listener, Scanner scanner) {
        this.menuListener = listener;
        this.mScanner = scanner;
    }

    public void printMenu() {
        clearMenu();
        System.out.println("\n\t\tSWATCH BHARATH KIOSK\n");
        System.out.println("\t1. Register a new user");
        System.out.println("\t2. View user coupons");
        System.out.println("\t3. Submit trash");
        System.out.print("\tSelect your choice  :");
    }

    public int readUserInput() throws IOException {
        Scanner userDataInputStream = this.mScanner;
        int i = 0;
        if (userDataInputStream.hasNext()) {
            try {
                i = Integer.parseInt(userDataInputStream.nextLine());
            } catch (NumberFormatException e) {
                runMenu();
            }
        }
        return i;
    }

    public void clearMenu() {
        Util.clearScreen();
    }

    /**
     * @return OnMenuOptionSelectedListener return the menuListener
     */
    public OnMenuOptionSelectedListener getMenuListener() {
        return menuListener;
    }

    /**
     * @param menuListener the menuListener to set
     */
    public void setMenuListener(OnMenuOptionSelectedListener menuListener) {
        this.menuListener = menuListener;
    }

    public void runMenu() {
        try {
            printMenu();
            int userInput = readUserInput();
            System.out.println("selected input :" + userInput);
            if (userInput == 0 || userInput > 3) {
                if (this.menuListener != null) {
                    this.menuListener.onInvalidMenuSelected();
                }
            } else {
                this.menuListener.onMenuItemSelected(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}