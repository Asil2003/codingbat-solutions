public class evenOdd {
    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] res1 = evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
