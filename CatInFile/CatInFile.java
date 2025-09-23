
import java.io.*;

public class CatInFile {

    public static void cat(String[] args) throws IOException {
        for (String path : args) {
            InputStream br = System.in;
            FileOutputStream fileOutputStream = null;
            try {

                fileOutputStream = new FileOutputStream(path);
                byte[] buffer = new byte[100];
                int byteRead;
                while ((byteRead = br.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);

                }
            } catch (IOException ioe) {

            }
        }
    }
}
