public class tripleUp {
    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(tripleUp(new int[]{1, 2, 3, 5, 6}));  // true
        System.out.println(tripleUp(new int[]{1, 2, 4, 5, 6}));  // false
        System.out.println(tripleUp(new int[]{1, 2, 4, 5, 7, 8, 9})); // true
    }
}
