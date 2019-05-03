package com.swatchbharath.com;

import java.util.Scanner;

import com.swatchbharath.com.MainMenu.OnMenuOptionSelectedListener;
import com.swatchbharath.com.RegisterUser.OnRegisterUserListener;

/**
 * Hello world!
 */
public final class App implements OnMenuOptionSelectedListener, OnRegisterUserListener {
    private MainMenu mainMenu;
    private RegisterUser registerUser;

    private App() {
        Scanner scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this, scanner);
        this.registerUser = new RegisterUser(this, scanner);
    }

    public void runApp() {
        this.mainMenu.runMenu();
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App swatchBharathApp = new App();
        swatchBharathApp.runApp();
    }

    @Override
    public void onMenuItemSelected(int menuId) {
        switch (menuId) {
        case 1: {
            // System.out.println("1 selected");
            this.registerUser.displayRegistrationMenu();
            break;
        }
        case 2: {
            // System.out.println("2 selected");
            this.mainMenu.runMenu();
            break;
        }
        case 3: {
            // System.out.println("3 selected");
            this.mainMenu.runMenu();
            break;
        }
        default:
            onInvalidMenuSelected();
            break;
        }
    }

    @Override
    public void onInvalidMenuSelected() {
        try {
            System.out.println("Invalid option selected, Please select a valid option.");
            this.mainMenu.runMenu();
            // this.mainMenu.readUserInput();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void OnRegistationComplete(String userName, String email, String mobileNumber, int id) {
        System.out.println("Registration completed");
        Util.sleep(1000);
        this.mainMenu.runMenu();
    }

    @Override
    public void OnRegistrationAborted() {
        System.out.println("Registration aborted");
    }
}
