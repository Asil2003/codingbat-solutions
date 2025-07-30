public class maxSpan {
    public static int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] == value) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break;
                }
            }
        }

        return maxSpan;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 1, 1, 3};
        System.out.println(maxSpan(test));  // Output should be 4
    }
}
