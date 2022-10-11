 // bir kaynağa veri yazmak

	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class Driver {
	public static void main(String[] args) {
		File file =new File("hello.txt"); //ilk işlem erişilmek istenen kaynağı tanıtmak(yani hedef kaynak belirledik)
		                                   // kaynağı belirtmek için file nesnesi kullanıldı
		                                   // yapıcı metodun içerisnde kaynağın adı alınıyor

	    FileOutputStream fileOutputStream=null; // bu kaynağa erişmek için bir fileoutput stream oluşturduk
	   try {
		   
		   fileOutputStream=new FileOutputStream(file); //fileoutputstream ilekaynağa erişip bu kaynağa veriler(merhaba yazısı) gönderdik
		   fileOutputStream.write("merhaba".getBytes()); // merhaba yazısının getbytes ile her bir karekterinin byte karşılığını aldık ve bu karşılığı writeile yazdık
		   
	   }catch (IOException e) {
		System.out.println(e.getMessage()); // alınan hata olursa ekrana yazırmak getmessage kullanıldı
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

