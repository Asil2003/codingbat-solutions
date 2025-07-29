public class only14 {
    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(only14(new int[]{1, 4, 1, 4})); // true
        System.out.println(only14(new int[]{1, 4, 2, 4})); // false
        System.out.println(only14(new int[]{1, 1}));       // true
    }
}
