package oopj;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        char[] data = new char[29];
        FileReader input = null;
        try {
            input = new FileReader("file.txt");
            int bytesRead = input.read(data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

