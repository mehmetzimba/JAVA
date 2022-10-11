package uygulama8select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Uygulama8select {

	
	static Connection connection=null;
	 static PreparedStatement preparedStatement=null;
	 static Resultset resultSet =null;
	 
	public static void main(String[] args) {
			
		
   baglantiAc(); 
    yazdır();
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
	public static void yazdır() {
		
		String sorgu ="SELECT*FROM ogrenci";
		try {
			preparedStatement=connection.prepareStatement(sorgu);
			
			resultSet=(Resultset) preparedStatement.executeQuery();
			
			while(((ResultSet) resultSet).next()
					) {
				int ogrenciId=((ResultSet) resultSet).getInt("ogrenciId");
				
				
				String adi=((ResultSet) resultSet).getString("adi");
				
				String soyadi=((ResultSet) resultSet).getString("soyadi");
				
				int dogumYılı=((ResultSet) resultSet).getInt("dogumYılı");
				String okulNumarası=((ResultSet) resultSet).getString("okulNumarası");
				
				System.out.println(ogrenciId+"  "+adi+"  "+soyadi+"  "+dogumYılı+"  "+okulNumarası);
				
			}
	
		} catch (SQLException e) {
			System.out.println("hata"+e);
		}
		
	}
	
	
	
	
	
	
}
