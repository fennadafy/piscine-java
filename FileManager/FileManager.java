
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    public static void createFile(String fileName, String content) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        String filecontent = null;
        Path filepath = Paths.get(fileName);
        try {
            filecontent = Files.readString(filepath);
        } catch (IOException e) {
            System.out.println("An error to reding from file: " + e.getMessage());
        }
        // System.out.println(new String(filecontent));

        return new String(filecontent);
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}
