
import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        int bytesToRead = 100;
        byte[] filecontent = null;
        try (FileInputStream fis = new FileInputStream(args[0]); ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[bytesToRead]; // Buffer for reading chunks of data
            int byteRead;
            // Read bytes from the file into the buffer and write to ByteArrayOutputStream
            while ((byteRead = fis.read(buffer, 0, bytesToRead)) != -1) {
                bos.write(buffer, 0, byteRead);
            }
            filecontent = bos.toByteArray();// Get the entire file content as a byte array
            String filecontantTostring = new String(filecontent);
            String[] words = filecontantTostring.split(" ");
            StringBuilder capitalaizedString = new StringBuilder();
            for (String word : words) {
                // System.out.print(word);
                if (!word.isEmpty()) {
                    String firstLetter = word.substring(0, 1).toUpperCase();
                    String remainingLetter = word.substring(1);
                    capitalaizedString.append(firstLetter).append(remainingLetter).append(" ");
                }
            }
            String result = capitalaizedString.toString().trim();
            // System.out.print(result);
            try (BufferedWriter write = new BufferedWriter(new FileWriter(args[1]))){
                write.write(result);
            }
        }
    }
}
