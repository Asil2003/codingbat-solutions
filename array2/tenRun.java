public class tenRun {
    public static int[] tenRun(int[] nums) {
        int multiple = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                multiple = nums[i];
            } else if (multiple != -1) {
                nums[i] = multiple;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] res1 = tenRun(new int[]{2, 10, 3, 4, 20, 5});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
