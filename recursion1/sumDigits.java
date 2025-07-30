public class sumDigits {
    public static int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }
}
