public class zeroMax {
    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > maxOdd) {
                        maxOdd = nums[j];
                    }
                }
                nums[i] = maxOdd;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] res1 = zeroMax(new int[]{0, 5, 0, 3});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
