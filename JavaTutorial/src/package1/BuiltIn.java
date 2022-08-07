package package1;

import java.util.Scanner;

public class BuiltIn {

	/*
	 * import
	 * java.util.scanner => kullanýcýdan veri almaya yarar 
	 * 
	 * 
	 */
	public void test() {
		System.out.println("adnýz:");
		Scanner scan = new Scanner(System.in);
		String adýnýz = scan.nextLine();
		System.out.println("sizin adýýz"+adýnýz);
		
	}
}
