public class nearTen {
    public boolean nearTen(int num) {
        int mod = num % 10;
        return (mod <= 2 || mod >= 8);
    }
}
