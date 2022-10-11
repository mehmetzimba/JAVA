import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;



public class Driver {
	public static void main(String[] args) {
		File file=new File("test.txt");
		FileOutputStream fileOutputStream= null;
		try {
			fileOutputStream =new FileOutputStream(file);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		    outputStreamWriter.write("merhaba dunya");
		    outputStreamWriter.close();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
