import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//bir kaynaktan veri okumak

public class Driver2 {
public static void main(String[] args) {
	File file =new File("hello.txt");
	FileInputStream fileInputStream=null;
	try {
		fileInputStream =new FileInputStream(file);//file nesnemizi fileınput streamin yapıcı metoduna gönderdik
        int c=0;
        while( (c=fileInputStream.read()) != -1	){
        	System.out.print((char)c);
        }	 
	
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}finally {
		if (fileInputStream != null) {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
}
