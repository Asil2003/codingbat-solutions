public class sum67 {
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean inBlock = false;

        for (int num : nums) {
            if (num == 6) {
                inBlock = true;
            } else if (inBlock && num == 7) {
                inBlock = false;
            } else if (!inBlock) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum67(new int[]{1, 2, 2}));           // 5
        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7})); // 5
        System.out.println(sum67(new int[]{1, 1, 6, 7, 2}));     // 4
    }
}
