public class has22 {
    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(has22(new int[]{1, 2, 2}));     // true
        System.out.println(has22(new int[]{1, 2, 1, 2}));  // false
        System.out.println(has22(new int[]{2, 1, 2}));     // false
    }
}
