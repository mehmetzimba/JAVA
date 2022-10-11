import java.util.Date;

public class Driver {
public static void main(String[] args) {
	Calısan calısan =new Calısan();
	calısan.setIseBaslamaTarihi(new Date());
	calısan.setIsim("mehmet");
	calısan.setMaas(2222);
	System.out.println(calısan.getIsim());
}
}
