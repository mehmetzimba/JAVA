
public class MsSQLConnection extends DbConnection {
	public void openConnection() {
		 System.out.println("msSQL bağlantı açıldı");
		 
		 
	 }
	 public void closeConnection() {
		 
		 System.out.println("msSQL kapatıldı");
	 }
	 
	 public void executeQuery() {
		 
		 System.out.println("msSQL komutları çalıştırıldı");
	 }

}
