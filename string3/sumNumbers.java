public class sumNumbers {
    public static int sumNumbers(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                num += c;
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        // Add last number if the string ends with digits
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));  // 123
        System.out.println(sumNumbers("aa11b33"));    // 44
        System.out.println(sumNumbers("7 11"));       // 18
    }
}
