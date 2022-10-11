import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	/*DbConnection dbConnection =new DbConnection();
	dbConnection.openConnection();
	dbConnection.executeQuery();
	dbConnection.closeConnection();*/
	DbConnection dbConnection =null;
	Scanner scanner =new Scanner(System.in);
	System.out.println("veri tipi seçimi yapınız 1-MsSQL 2- OracleDb 3-MySQL");
	int dbtype =scanner.nextInt();
		switch (dbtype) {
		case 1: 
			dbConnection=new MsSQLConnection();
			break;
		case 2: 
			
			dbConnection=new OracleDbConnection();
			break;
		case 3: 
			
			dbConnection=new MySQLConnection();
			break;
		default:
			System.out.println("geçersiz veri tipi");
			break;
		}
		if(dbConnection != null) {
			dbConnection.openConnection();
			dbConnection.executeQuery();
			dbConnection.closeConnection();
			
		}
	
	
		}
		}
		
