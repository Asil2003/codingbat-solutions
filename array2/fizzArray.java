public class fizzArray {
    public static int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = fizzArray(4); // [0, 1, 2, 3]
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
