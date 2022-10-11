
public class OracleDbConnection extends DbConnection {
	public void openConnection() {
		 System.out.println("oracle bağlantı açıldı");
		 
		 
	 }
	 public void closeConnection() {
		 
		 System.out.println("oracle  bağlantı kapatıldı");
	 }
	 
	 public void executeQuery() {
		 
		 System.out.println("oracle komutları çalıştırıldı");
	 }
	
	
	
}
