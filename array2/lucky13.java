public class lucky13 {
    public static boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4}));     // true
        System.out.println(lucky13(new int[]{1, 2, 3}));     // false
        System.out.println(lucky13(new int[]{1, 2, 4}));     // false
    }
}
