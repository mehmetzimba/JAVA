package for2;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String[] names;
	System.out.println("kaç kişi girilecek ");
	names = new String[Integer.parseInt(scanner.nextLine())];
	
	for(int i =0;i< names.length;i++ ) {
		System.out.println((i+1) + " . kişi");
		names[i]=scanner.nextLine();
	}
	
	
}
}
