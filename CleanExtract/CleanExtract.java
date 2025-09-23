
public class CleanExtract {

    public static String extract(String s) {
        String[] arr = s.split("\\|");
        String result = "";
        String tomp = "";
        int arr_length = 0;
        for (String d : arr) {
            if (d.contains(".")) {

                boolean is_valid_text = false;
                String withou = d.trim();
                for (int i = 0; i < withou.length(); i++) {
                    if (withou.charAt(i) == '.') {
                        if (arr_length == arr.length - 1 && is_valid_text) {
                            tomp = tomp + '.';
                        }
                        is_valid_text = !is_valid_text;
                        continue;
                    }
                    if (withou.charAt(i) == ' ' && tomp.isEmpty()) {
                        continue;
                    }

                    if (is_valid_text) {
                        tomp = tomp + withou.charAt(i);
                    }
                }
            } else {
                tomp = tomp + d.trim();
            }

            result = result + tomp;
            if (!tomp.isEmpty() && tomp.charAt(tomp.length() - 1) != ' ' && tomp.charAt(tomp.length() - 1) != '.' && arr_length != arr.length - 1) {
                result = result + " ";
            }
            arr_length++;
            tomp = "";
        }
        return result;
    }
}
