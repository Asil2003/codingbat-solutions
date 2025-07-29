public class withoutString {
    public static String withoutString(String base, String remove) {
        // Use regex with (?i) to ignore case, and escape remove properly
        String regex = "(?i)" + java.util.regex.Pattern.quote(remove);
        return base.replaceAll(regex, "");
    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo")); // → "He there"
        System.out.println(withoutString("Hello there", "e"));   // → "Hllo thr"
        System.out.println(withoutString("Hello there", "x"));   // → "Hello there"
    }
}
