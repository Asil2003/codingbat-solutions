public class count8 {
    public static int count8(int n) {
        if (n == 0) return 0;
        int last = n % 10;
        int next = (n / 10) % 10;
        if (last == 8) {
            if (next == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }
}
