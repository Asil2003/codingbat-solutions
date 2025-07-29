public class fizzArray3 {
    public static int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] res1 = fizzArray3(5, 10);  // [5, 6, 7, 8, 9]
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
