package package1;

import java.util.Scanner;

public class BuiltIn {

	/*
	 * import
	 * java.util.scanner => kullan�c�dan veri almaya yarar 
	 * 
	 * 
	 */
	public void test() {
		System.out.println("adn�z:");
		Scanner scan = new Scanner(System.in);
		String ad�n�z = scan.nextLine();
		System.out.println("sizin ad��z"+ad�n�z);
		
	}
}
