import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {
public static void main(String[] args) {
	File file =new File("hello.txt"); //ilk işlem erişilmek istenen kaynağı tanıtmak
	                                   // kaynağı belirtmek için file nesnesi kullanıldı
	                                   // yapıcı metodun içerisnde kaynağın adı alınıyor

    FileOutputStream fileOutputStream=null;
   try {
	   
	   fileOutputStream=new FileOutputStream(file);
	   fileOutputStream.write("merhaba".getBytes());
	   
   }catch (IOException e) {
	System.out.println(e.getMessage());
}finally {
	if(fileOutputStream != null) {
		try {
			fileOutputStream.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
}


}
}
