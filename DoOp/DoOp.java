
public class DoOp {

    public static String operate(String[] args) {
        String result = "";
        String operation = "";
        int first = 0;
        int sec = 0;
        if (args.length == 0) {
            return "Error";
        }
        first = Integer.parseInt(args[0]);
        if (args.length == 2) {
            operation = args[1];
        }
        if (args.length == 3) {
            sec = Integer.parseInt(args[2]);
        }

        if (operation == "+") {
            return Integer.toString(first + sec);
        } else if (operation == "-") {
            return Integer.toString(first - sec);
        } else if (operation == "%") {
            if (sec == 0) {
                return "Error";
            }
            return Integer.toString(first % sec);
        } else if (operation == "*") {
            return Integer.toString(first * sec);
        } else if (operation == "/") {
            if (sec == 0) {
                return "Error";
            }
            return Integer.toString(first / sec);
        }
        return result;
    }
}
