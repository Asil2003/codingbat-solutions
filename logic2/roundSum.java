public class roundSum {
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        int mod = num % 10;
        if (mod >= 5) {
            return num + (10 - mod);
        } else {
            return num - mod;
        }
    }
}
