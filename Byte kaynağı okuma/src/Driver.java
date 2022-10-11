import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
                                    //byte tabanlı okuma
public class Driver {
public static void main(String[] args) {
	File file=new File("C:\\Users\\PC-LENOVO\\Desktop\\YDS KELİMELER\\1-20 YDS HAZIRLIK 1234\\accountability (sorumluluk).jpg");
	System.out.println(file.exists());
	if (file.exists()) {
		FileInputStream fileInputStream =null;
		try {
			fileInputStream =new FileInputStream(file);
			byte[] buffer =new byte[1024];
			fileInputStream.read(buffer);
			int lenght =0;
			while((lenght = fileInputStream.read(buffer)) !=-1) { 
			 System.out.println(Arrays.toString(buffer));
			
			
			}
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fileInputStream !=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
}
