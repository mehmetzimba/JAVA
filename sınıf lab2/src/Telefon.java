
public class Telefon {
 TelefonTipi tip;
 String marka;
 String model;
 boolean wifi;
 boolean mobilVeri;
 boolean aramaVarmi;
 
 void aramaYap (String telefonNumarası) {
	 System.out.println(telefonNumarası);
	 aramaVarmi =true;
 }
 void aramayıSonlandır() {
	 if(aramaVarmi)
	 System.out.println("arama sonlandırıldı");
 }
 void mesajGonder (String mesaj) {
	 if(mobilVeri|| wifi )
	 System.out.println("mesaj gönderildi");
	 
 }
}
