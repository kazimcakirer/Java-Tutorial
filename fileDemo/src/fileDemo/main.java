package fileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static String path = "C:\\Users\\user\\eclipse-workspace\\fileDemo\\src\\fileDemo\\test.txt";

	public static void main(String[] args) {
		
		createFile();
		getFileInfo();
		readFile();

	}

	public static void createFile() {
		File file = new File(path);

		try {

			if (file.createNewFile()) {
				System.out.println("Dosya oluþturuldu..");
			} else {
				System.out.println("Dosya oluþturulmuþ. Tekrar oluþturulamaz.!");
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File(path);
		if (file.exists()) {
			System.out.println("Dosya adý: " + file.getName());
			System.out.println("Dosya adý: " + file.getAbsolutePath());
			System.out.println("Dosya adý: " + file.canWrite());
			System.out.println("Dosya adý: " + file.canRead());
			System.out.println("Dosya adý: " + file.length());

		}
	}

	public static void readFile() {
		File file = new File(path);
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
