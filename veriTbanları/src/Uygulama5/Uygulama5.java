package Uygulama5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uygulama5 {
	
	static Connection connection=null;
	 static PreparedStatement preparedStatement=null;
	public static void main(String[] args) {
			
		
   baglantiAc(); 
  
   ogrenciEkle(102, "CENGİZ", "KARA", 123555, "12554522");
   ogrenciEkle(103, "AYŞE", "KARAM", 5555, "12554522");
   ogrenciEkle(104, "MEHMET", "KARA", 123555, "12774522");
	
		
	baglantiKapat();	
	}
	
	public static void baglantiAc() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql driver bulunamadı"+e);
			
		}
		try {
		
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/calısma", "root", "mehmet58");
			 System.out.println("başarılı bağlantı");
			
			 
			 
			} catch (SQLException e) {
				System.out.println("mysql e bağlanamadı"+e);
				
			}
		
		
		
		
	}
	public static void baglantiKapat() {
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				System.out.println("prepared statement kapanırken hata"+e);
			}
			
		}
		
		
		
		
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("connection kapatılırken hatayla karşılaşıldı");
			}
	}
	
	}	
	 public static void ogrenciEkle(int ogrenciId, String adi,String soyadi, int dogumYılı,String okulNumarası) {
		 String sorgu= "INSERT INTO ogrenci(ogrenciId,adi,soyadi,dogumYılı,okulNumarası) VALUES(?,?,?,?,?)";  
			
			try {
				preparedStatement=connection.prepareStatement(sorgu);
				preparedStatement.setInt(1,ogrenciId);
				preparedStatement.setString(2, adi); //2. ? NE KARŞILK GELEN DEĞER
				preparedStatement.setString(3,soyadi);
				preparedStatement.setInt(4,dogumYılı);
				preparedStatement.setString(5,okulNumarası);
				preparedStatement.executeUpdate();
				
				
			} catch (SQLException e) {
				System.out.println("HATA"+e);
			}
}
}