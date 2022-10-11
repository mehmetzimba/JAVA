import com.example.Araba;  // farklı pakette bulunan Araba classı import  edilerek erişilmeye çalışılır.
public class Driver {
public static void main(String[] args) {
	Ogrenci ogrenci =new Ogrenci();
	//ogrenci.ad="mehmet"; // Ogrenci classında private olduğu için gizli
    ogrenci.numaraAl();
    Araba araba =new Araba();
    //araba.model;  // default olduğu için erişlemez
    System.out.println(araba.marka);
}
}
