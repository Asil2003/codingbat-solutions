public class more14 {
    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int num : nums) {
            if (num == 1) count1++;
            if (num == 4) count4++;
        }

        return count1 > count4;
    }

    public static void main(String[] args) {
        System.out.println(more14(new int[]{1, 4, 1})); // true
        System.out.println(more14(new int[]{1, 4, 1, 4})); // false
        System.out.println(more14(new int[]{1, 1})); // true
    }
}
