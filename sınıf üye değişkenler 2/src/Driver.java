import java.util.Iterator;

public class Driver {
public static void main(String[] args) {
	Oyuncu oyuncu1= new Oyuncu();
	System.out.println(oyuncu1.saglık);
	for(int i =0; i<30;i++) {
		oyuncu1.darbe();
		System.out.println(oyuncu1.saglık);
		
	}
}
}
