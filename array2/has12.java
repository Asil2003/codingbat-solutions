public class has12 {
    public static boolean has12(int[] nums) {
        boolean found1 = false;

        for (int num : nums) {
            if (num == 1) {
                found1 = true;
            }
            if (found1 && num == 2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(has12(new int[]{1, 3, 2}));       // true
        System.out.println(has12(new int[]{3, 1, 2}));       // true
        System.out.println(has12(new int[]{3, 1, 4, 5, 2})); // true
        System.out.println(has12(new int[]{3, 2, 1}));       // false
    }
}
