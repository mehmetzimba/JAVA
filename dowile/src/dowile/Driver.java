package dowile;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
     String password= null ;
     Scanner scanner = new Scanner(System.in);
     
     do {
		System.out.println("parola");
		password= scanner.nextLine();
	} while (!password.equals("123"));
 System.out.println("hoşgeldiniz1");
	}

}
