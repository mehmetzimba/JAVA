import java.util.Date;

public class Driver {
public static void main(String[] args) {
	Calısan calısan =new Calısan();
	calısan.setİsim("ali can");
	calısan.setİsegiristarihi(new Date());
	calısan.setMaas(15000); // değer vermek için set 
	System.out.println(calısan.getİsim());// değerleri okumak için get
	System.out.println(calısan.getMaas());
	System.out.println(calısan.getİsegiristarihi());
	
}
}
