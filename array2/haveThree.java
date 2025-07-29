public class haveThree {
    public static boolean haveThree(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }

        return count == 3;
    }

    public static void main(String[] args) {
        System.out.println(haveThree(new int[]{3, 1, 3, 1, 3}));  // true
        System.out.println(haveThree(new int[]{3, 1, 3, 3}));     // false
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4}));  // false
    }
}
