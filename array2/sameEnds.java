public class sameEnds {
    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1)); // true
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2)); // true
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3)); // false
    }
}
