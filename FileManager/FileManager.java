
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void createFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        int bytesToRead = 100;
        byte[] filecontent = null;
        try (FileInputStream fis = new FileInputStream(fileName); ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int byteRead;
            byte[] buffer = new byte[bytesToRead];
            while ((byteRead = fis.read(buffer , 0, bytesToRead)) != -1) { 
                bos.write(buffer , 0, bytesToRead);
            }
            filecontent = bos.toByteArray();
        } catch (IOException e) {
             System.out.println("An error to reding from file: " + e.getMessage());
        }
            return new String(filecontent);
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}
