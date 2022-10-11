import java.util.Arrays;

public class Driver {
public static void main(String[] args) {
		Elma[] elmalar= {
				new Elma(10),
				new Elma(40),
				new Elma(20),
				new Elma(5)
				
		};
		System.out.println(Arrays.toString(elmalar));
	
	 Arrays.sort(elmalar,new ElmaKarsilastirici());;
	 System.out.println(Arrays.toString(elmalar));
}
}
