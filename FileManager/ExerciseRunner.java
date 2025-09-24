import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        FileManager.createFile("fileName.file","""
                    This file has many lines
                    Here is the second.
                    And there is the 3rd !
                    """ );
        System.out.println(FileManager.getContentFile("fileName.file"));
        // FileManager.deleteFile("file.txt");
    }
}