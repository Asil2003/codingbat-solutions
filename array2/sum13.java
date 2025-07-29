public class sum13 {
    public static int sum13(int[] nums) {
        int sum = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2;
            } else {
                sum += nums[i];
                i++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum13(new int[]{1, 2, 2, 1}));           // 6
        System.out.println(sum13(new int[]{1, 1, 13, 1, 1}));       // 3
        System.out.println(sum13(new int[]{13, 1, 2, 13, 2, 1, 13})); // 3
    }
}
