public class zeroFront {
    public static int[] zeroFront(int[] nums) {
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                insertPos++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] res1 = zeroFront(new int[]{1, 0, 0, 1, 0});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
