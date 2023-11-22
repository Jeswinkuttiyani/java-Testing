package oopj;
import java.io.FileWriter;
import java.io.IOException; 
public class FilewritterDemo {
    public static void main(String[] args) {
		String data="i am jeswin jose";
		FileWriter fw=null;
		try {
			fw=new FileWriter("file.txt");
			fw.write(data);
		    }
		catch(IOException e){
			e.printStackTrace();
		    }
		finally {
			try {
				fw.flush();
				fw.close();
			    }
			catch(IOException e){
				e.printStackTrace();
		        }
	        }

      }
}

