
public class Driver {
public static void main(String[] args) {
	Kalem kursunkalem = new Kalem();
	kursunkalem.marka ="a marka";
	kursunkalem.tip ="kursun";
	kursunkalem.doldurabilir =false;
	kursunkalem.silinebilir =true;
	kursunkalem.yaz("merhaba dünya");
	kursunkalem.tekrardoldur();
	kursunkalem.sil();
}
}
