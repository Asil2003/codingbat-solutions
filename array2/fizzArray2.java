public class fizzArray2 {
    public static String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] result = fizzArray2(4); // ["0", "1", "2", "3"]
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
