public class countX {
    public static int countX(String str) {
        if (str.length() == 0) return 0;
        int count = (str.charAt(0) == 'x') ? 1 : 0;
        return count + countX(str.substring(1));
    }
}
