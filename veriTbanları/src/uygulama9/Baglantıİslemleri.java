package uygulama9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.*;

public class Baglantıİslemleri {

	
	private Connection connection;
	private PreparedStatement preparedStatement;
	private Resultset resultset;
	
	

	
	
	public Connection baglantiyiAl( ) {
		 Connection connection=null;
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
				return null;
			}
		return connection;
				
				
	
	}
	public  void baglantiKapat(Connection connection,PreparedStatement preparedStatement,Resultset resultset) {
		
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				System.out.println("prepared statement kapanırken hata"+e);
			}
	
	
	
		}
	
	   if( connection !=null) {
		   try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("connection kapanırken hata"+e);
		}
	   }
	 if (resultset !=null) {
		 try {
			((Connection) resultset).close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("resultset kapanırken hata"+e);
		}
		
	}
	
	}
	
}
