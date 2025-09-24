
import java.io.File;

public class FileSearch {

    public static String searchFile(String fileName) {
        String result = "documents/";
        File doc = new File("documents");
        File arr[] = doc.listFiles();
        return RecursivePrint(arr, 0, fileName);
    }

    static String RecursivePrint(File[] files, int level, String fileName) {
        for (File f : files) {
            if (f.isFile() && fileName.equals(f.getName())) {
                return  f.getPath();
            } else if (f.isDirectory()) {
               return RecursivePrint(f.listFiles(), level + 1, fileName);
            }
        }
        return null;
    }
}
