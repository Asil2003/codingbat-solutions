public class fix34 {
    public static int[] fix34(int[] nums) {
        int fourIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                while (nums[fourIndex] != 4 || (fourIndex > 0 && nums[fourIndex - 1] == 3)) {
                    fourIndex++;
                }
                int temp = nums[i + 1];
                nums[i + 1] = nums[fourIndex];
                nums[fourIndex] = temp;
            }
        }
        return nums;
    }
}
