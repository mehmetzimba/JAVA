import java.time.LocalDate;




public class Driver {
public static void main(String[] args) {
	
	System.out.println(LocalDate.now());
	System.out.println(LocalDate.of(1990,6,22));
	System.out.println(LocalDate.parse("2020-06-06"));
	LocalDate tarih =LocalDate.parse("2021-11-14"); 
	System.out.println(tarih.getDayOfWeek());// hangi güne denk geliyor 
	LocalDate ilktarih=LocalDate.parse("2021-11-15"); // tarih kıyaslaması
	LocalDate ikincitarih=LocalDate.parse("2021-11-14");
	System.out.println(ilktarih.isAfter(ikincitarih));
	System.out.println(ilktarih.isBefore(ikincitarih));
}
}
