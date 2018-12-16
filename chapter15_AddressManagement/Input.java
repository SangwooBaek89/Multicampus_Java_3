package chapter15_AddressManagement;

import java.util.Scanner;

public class Input {
	static String getString(String str) {
		System.out.print(str + " : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
