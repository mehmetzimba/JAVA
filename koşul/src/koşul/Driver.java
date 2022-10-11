package koşul;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("yaşınızı giriniz");
	 int age = scanner.nextInt();
	 System.out.println(age>18 ? "ehliyet alabilirisiniz" : "ehliyet alamazsınız"); // ? sonra istenen koşul : dan sonra aksiş koşul  ve bu javada farklı koşul gösterimi
	}

}
