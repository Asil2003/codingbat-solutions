public class countTriple {
    public static int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i + 1) && c == str.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));     // 1
        System.out.println(countTriple("xxxabyyyycd"));   // 3
        System.out.println(countTriple("a"));             // 0
    }
}
