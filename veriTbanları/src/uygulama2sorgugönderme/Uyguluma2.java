package uygulama2sorgugönderme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import com.mysql.cj.jdbc.StatementImpl;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class Uyguluma2 {
public static void main(String[] args) {
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql driver bulunamadı"+e);
			return;
		}
		 Connection connection=null;
		 Statement statement=null;
		try {
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/calısma", "root", "mehmet58");
		 System.out.println("başarılı bağlantı");
		  statement = connection.createStatement();
		  
		  String sorgu="CREATE TABLE Student( ogrenciId INT PRIMARY KEY NOT NULL,adi VARCHAR(20),soyadi Varchar(20),dogumYılı INT,okulNumarası VARCHAR(20))";
		  
		 boolean durum= statement.execute(sorgu);
		 if (durum) {
			System.out.println("başarılı şekilde sorgu çalıştırıldı");
		}else {
			System.out.println("sorgu çalıştırma başarısız");
		}
		  
		 
		 
		} catch (SQLException e) {
			System.out.println("mysql e bağlanamadı"+e);
			
		}finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println("statement kapatılırken hatayla karşılaşıldı");
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
	
	
	

