
import java.io.*;
// import java.io.File.*;

public class Cat {


    public static void cat(String[] args) throws IOException {

        for (String path : args) {
            try (FileInputStream fis = new FileInputStream(path)){
                int byteRead ;
                while ((byteRead = fis.read()) != -1) { 
                    System.out.print((char ) byteRead);
                }
            }
        }
    }
}
