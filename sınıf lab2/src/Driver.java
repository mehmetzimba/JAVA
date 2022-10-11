
public class Driver {
public static void main(String[] args) {
	Telefon telefon= new Telefon();
	telefon.marka="x marka";
	telefon.model ="y model";
	telefon.tip =TelefonTipi.CEP;
	telefon.mobilVeri =true;
	telefon.wifi =true;
	telefon.aramaYap("525525225");
	telefon.aramayıSonlandır();
	telefon.mesajGonder("naber kanks");
}
}
