public class shiftLeft {
    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0) return nums;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    public static void main(String[] args) {
        int[] res1 = shiftLeft(new int[]{6, 2, 5, 3});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
