
import java.io.*;
// import java.io.File.*;

public class Cat {

    public static void cat(String[] args) throws IOException {

        for (String path : args) {
            int bytesToRead = 100;
            try (FileInputStream fis = new FileInputStream(path)) {
                byte[] buffer = new byte[bytesToRead];
                int byteRead;
                while ((byteRead = fis.read(buffer, 0, bytesToRead)) != -1) {
                    System.out.write(buffer, 0, byteRead);
                }
            }
        }
    }
}
