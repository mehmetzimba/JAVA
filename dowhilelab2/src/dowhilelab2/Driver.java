package dowhilelab2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long total =0 ;
		while(true) {
			
			int x =scanner.nextInt();
			total =total +x;
			if(x==0) {
				break;
			}
			
			
		}
		System.out.println(total);
	}

}
