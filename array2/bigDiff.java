public class bigDiff {
    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{10, 3, 5, 6})); // 7
        System.out.println(bigDiff(new int[]{7, 2, 10, 9})); // 8
        System.out.println(bigDiff(new int[]{2, 10, 7, 2})); // 8
    }
}
