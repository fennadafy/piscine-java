
public class DoOp {

    public static String operate(String[] args) {
         if (args.length != 3) {
            return "Error";
        }

        String result = "";
        String operation = args[1];
        int first = Integer.parseInt(args[0]);
        int sec =  Integer.parseInt(args[2]);
        
        
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
