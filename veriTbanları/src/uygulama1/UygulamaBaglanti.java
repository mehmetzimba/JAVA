package uygulama1;

import java.sql.*;


public class UygulamaBaglanti {
  public static void main(String[] args) {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("mysql driver bulunamadı"+e);
		return;
	}
	 Connection connection=null;
	try {
	 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/calısma", "root", "mehmet58");
	 System.out.println("başarılı bağlantı");
	} catch (SQLException e) {
		System.out.println("mysql e bağlanamadı"+e);
	}
	 finally {
		if (connection !=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("bağlantı kapatılırken bir hata oluştu");
			}
		}
	}
	 
	 
}
}
