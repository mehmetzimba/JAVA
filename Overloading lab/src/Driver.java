import java.util.Date;

public class Driver {
public static void main(String[] args) {
	
	Calisan calisan1=new Calisan();
	calisan1.bilgileriyazdır();
	Calisan calisan2=new Calisan("ARGE");
	calisan2.bilgileriyazdır();
	Calisan calisan3=new Calisan("ARGE", "MEHMET");
	calisan3.bilgileriyazdır();
	Calisan calisan4=new Calisan("ARGE", "MEHMET",new Date());
	calisan4.bilgileriyazdır();
	
}
}
