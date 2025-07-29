public class sumDigits {
    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0';  // Convert char digit to int
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));   // 6
        System.out.println(sumDigits("aa11b33"));    // 8
        System.out.println(sumDigits("Chocolate"));  // 0
    }
}
