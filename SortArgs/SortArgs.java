
import java.util.Arrays;

public class SortArgs {

    public static void sort(String[] args) {
        Arrays.sort(args);
        int count = 0;
        for (String c : args) {
            count++;
            if (count == args.length) {
                System.out.print(c);
            } else {
                System.out.print(c + " ");
            }
        }
        System.out.print("\n");
    }
}
