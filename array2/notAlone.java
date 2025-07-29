public class notAlone {
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] res1 = notAlone(new int[]{1, 2, 3}, 2);
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
