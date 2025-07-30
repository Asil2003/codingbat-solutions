public class endX {
    public static String endX(String str) {
        if (str.length() == 0) return "";
        char first = str.charAt(0);
        String rest = endX(str.substring(1));
        if (first == 'x') {
            return rest + first;
        } else {
            return first + rest;
        }
    }
}
