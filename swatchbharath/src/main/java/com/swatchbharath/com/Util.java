package com.swatchbharath.com;

import java.io.IOException;
import java.util.regex.Pattern;

public class Util {

	public static void clearScreen() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.print("\033[H\033[2J");
		// System.out.flush();
	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isValidEmail(String email) {
		return Pattern.matches("^(.+)@(.+)$", email);
	}
}