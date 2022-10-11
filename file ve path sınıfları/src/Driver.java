import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Driver {
public static void main(String[] args) {
	File file =new File("C:\\Users\\PC-LENOVO\\Desktop\\sample.txt");
	System.out.println(file.exists()); //path ile ulaştığımız dosyanın olup olmadığının kontrolü
    System.out.println(file.canRead()); // dosyanın okuma izinin olup olmadığı kontrolü
    System.out.println(file.canWrite()); // dosyanın yazma izinin olup olmadığı kontrolü 
    System.out.println(file.isDirectory()); // bu klasör mü sorgusu
    System.out.println(file.getAbsolutePath()); // dosyanın tam konumunu almak için
    System.out.println(file.getParent()); // dosyanın üst klasörü/dosyası sorgulama
     System.out.println(file.length());  // dosya içerisi kaç byte
    System.out.println(new Date(file.lastModified())); // dosya üzerinde yapılan son işlem ne zaman(uni time şeklinde)
    
    
    
    File file2 =new File("C:\\Users\\PC-LENOVO\\Desktop\\ornek.txt"); // yeni file oluşturduk path olarak daa masüstünü verdik
     /*if (file2.exists()!= true) {                                     // dosyamızın adı ornek olsun dedik
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} */
     
   file2.exists();  // oluşturduğumuz file2 y isildik
     

}
}
