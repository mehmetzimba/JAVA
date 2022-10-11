import java.util.Iterator;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	 /*for(int i = 0; i<10;i++) {
		
		
		System.out.println(i);
	}*/
	/*int[] numbers = {2,4,6,8,10,12};
	for (int i= 0 ;i<numbers.length; i++) {
		
		System.out.println(numbers[i]);
	}*/
	Scanner scanner =new Scanner(System.in);
	System.out.println("1. sayıyı giriniz:");
	int x= scanner.nextInt();
	System.out.println("2. sayıyı giriniz:");
	int y = scanner.nextInt();
	for(int i =x; i<y ; i++) {
		if(i%2 ==0)
		System.out.println(i);
	}
	

	
	
}
}
