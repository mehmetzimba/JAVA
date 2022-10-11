import java.io.PrintWriter;

public class DosyaIslemleri {
	public static void main(String[] args) {
	try {
		 
		PrintWriter yazici =new  PrintWriter("C:/Users/PC-LENOVO/Desktop/ metin.txt");
	    yazici.println("mehmet");
	    yazici.println("zımba");
	
	  yazici.close();
	
	} catch (Exception e) {
		System.err.println("hatalı path!!!"+e);
	}	 
		
		
		
		
		
		
	}

}
