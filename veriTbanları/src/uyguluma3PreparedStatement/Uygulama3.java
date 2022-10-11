package uyguluma3PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Uygulama3 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql driver bulunamadı"+e);
			return;
		}
		 Connection connection=null;
		 PreparedStatement preparedStatement=null;
		
		try {
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/calısma", "root", "mehmet58");
		 System.out.println("başarılı bağlantı");
		 String sorgu="CREATE TABLE Student( ogrenciId INT PRIMARY KEY NOT NULL,adi VARCHAR(20),soyadi Varchar(20),dogumYılı INT,okulNumarası VARCHAR(20))";
		 
		  preparedStatement=connection.prepareStatement(sorgu);
		  preparedStatement.execute();
		 
		 
		} catch (SQLException e) {
			System.out.println("mysql e bağlanamadı"+e);
			
		}finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("hata"+e);
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
	
}
	
		
		
		
		
		
		
		

