public class withoutTen {
    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int insertPos = 0;

        for (int num : nums) {
            if (num != 10) {
                result[insertPos++] = num;
            }
        }

        // Remaining positions are already zero by default

        return result;
    }

    public static void main(String[] args) {
        int[] res1 = withoutTen(new int[]{1, 10, 10, 2});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
