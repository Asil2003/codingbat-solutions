public class matchUp {
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff > 0 && diff <= 2) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10})); // 2
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));  // 3
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));  // 2
    }
}
