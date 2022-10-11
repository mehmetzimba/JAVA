package Uygulama4;

import java.sql.*;
public class Uygulama4 {
	static Connection connection=null;
	 static PreparedStatement preparedStatement=null;
	public static void main(String[] args) {
			
		
    baglantiAc(); 
    
    String sorgu= "INSERT INTO ogrenci(ogrenciId,adi,soyadi,dogumYılı,okulNumarası) VALUES(?,?,?,?,?)";
		
		try {
			preparedStatement=connection.prepareStatement(sorgu);
			preparedStatement.setInt(1,100);
			preparedStatement.setString(2, "MEHMET"); //2. ? NE KARŞILK GELEN DEĞER
			preparedStatement.setString(3, "ZIMBA");
			preparedStatement.setInt(4,1992);
			preparedStatement.setInt(5,1112231);
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("HATA"+e);
		}
		
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
}
