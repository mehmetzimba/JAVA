
public class MySQLConnection extends DbConnection {

	 public void openConnection() {
		 System.out.println("MySQL bağlantı açıldı");
		 
		 
	 }
	 public void closeConnection() {
		 
		 System.out.println("\"MySQL kapatıldı");
	 }
	 
	 public void executeQuery() {
		 
		 System.out.println("MySQL çalıştırıldı");
	 }
}
