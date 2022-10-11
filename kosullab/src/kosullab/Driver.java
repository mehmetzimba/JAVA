package kosullab;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		int x =10;
	    System.out.println("X İLE KARŞILAŞTIRILACAK DEĞERİ GİRİNİZ");
	    Scanner scanner = new Scanner(System.in);
	    int i = scanner.nextInt();
	    System.out.println(x>i ? "x  girilen değerden büyüktür" : "x girilen değerden küçüktür");
	}

}
