public class countAbc {
    public static int countAbc(String str) {
        if (str.length() < 3) return 0;
        String firstThree = str.substring(0, 3);
        if (firstThree.equals("abc") || firstThree.equals("aba")) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }
}
