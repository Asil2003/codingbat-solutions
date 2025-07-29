public class pre4 {
    public static int[] pre4(int[] nums) {
        int index = 0;

        while (index < nums.length && nums[index] != 4) {
            index++;
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] res1 = pre4(new int[]{1, 2, 4, 1});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
