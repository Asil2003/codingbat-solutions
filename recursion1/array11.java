public class array11 {
    public static int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        int count = (nums[index] == 11) ? 1 : 0;
        return count + array11(nums, index + 1);
    }
}
