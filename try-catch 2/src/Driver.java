import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	int[] numbers = {0,1,2,3,4,5};
	Scanner scanner =new Scanner(System.in);
	
	try {
	System.out.print("index değerini giriniz");
	int a= scanner.nextInt();
	System.out.println(numbers[a]);
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("0ila 5 arasında sayı girilmedi");
	}catch (InputMismatchException e) {
		System.out.println(" sayı girilmedi");
	}
	finally {
		scanner.close();
	}
}
}
