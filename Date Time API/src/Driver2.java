import java.time.LocalDate;
import java.util.Scanner;

public class Driver2 {
public static void main(String[] args) {
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("DOĞUM TARİHİ:");
	String line = scanner.nextLine();
	LocalDate dogumTarihi=LocalDate.parse(line);
	System.out.println("doğum tarihiniz:"+dogumTarihi);
	System.out.println("yasınız:"+(LocalDate.now().getYear()-dogumTarihi.getYear()));
}
}
