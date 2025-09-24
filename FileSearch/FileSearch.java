
import java.io.File;

public class FileSearch {

    public static String searchFile(String fileName) {
        File doc = new File("documents");
        File arr[] = doc.listFiles();
        return RecursivePrint(arr, 0, fileName);
    }

    static String RecursivePrint(File[] files, int level, String fileName) {
        if (files == null) {
            return null;
        }
        for (File f : files) {
            if (f.isFile() && fileName.equals(f.getName())) {
                return f.getPath();
            } else if (f.isDirectory()) {
                String rec = RecursivePrint(f.listFiles(), level + 1, fileName);
                if (rec != null) {
                    return rec;
                }
            }
        }
        return null;
    }
}
