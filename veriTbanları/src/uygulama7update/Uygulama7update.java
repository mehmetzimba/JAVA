package uygulama7update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uygulama7update {

	
	
	static Connection connection=null;
	 static PreparedStatement preparedStatement=null;
	public static void main(String[] args) {
			
		
    baglantiAc(); 
 guncelle("ömer","6624444",103);

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
	
	
	
	
	}
	public static void guncelle(String adi,String okulnumarası,int ogrenciId) {
		
		String sorgu ="UPDATE ogrenci SET adi=?,okulNumarası =? WHERE ogrenciId=? ";
		try {
			preparedStatement=connection.prepareStatement(sorgu);
			preparedStatement.setString(1, adi);
			preparedStatement.setString(2, okulnumarası);
			preparedStatement.setInt(3, ogrenciId);
			preparedStatement.executeUpdate();
			System.out.println("güncelleme yapıldı");
			
			
			
		} catch (SQLException e) {
			System.out.println("hata"+e);
		}
		
	}
}
