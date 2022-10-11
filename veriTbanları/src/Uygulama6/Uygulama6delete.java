package Uygulama6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uygulama6delete {
	
	static Connection connection=null;
	 static PreparedStatement preparedStatement=null;
	public static void main(String[] args) {
			
		
  baglantiAc(); 
 ogrenciSil(102);

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
	
   public static void ogrenciSil(int ogrenciId) {
	   
	   String sorgu= "DELETE FROM ogrenci WHERE ogrenciId =?";
	   try {
		preparedStatement=connection.prepareStatement(sorgu);
		preparedStatement.setInt(1, ogrenciId);
		preparedStatement.executeUpdate();
		System.out.println(ogrenciId+"ıd numaralı ögrenci silindi");
		
		
	} catch (SQLException e) {
		System.out.println("hata"+e);
	}
	   
	   
   }
	

}
