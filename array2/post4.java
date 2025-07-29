public class post4 {
    public static int[] post4(int[] nums) {
        int index = nums.length - 1;

        while (index >= 0 && nums[index] != 4) {
            index--;
        }

        int size = nums.length - index - 1;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = nums[index + 1 + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] res1 = post4(new int[]{2, 4, 1, 2});
        for (int num : res1) {
            System.out.print(num + " ");
        }
    }
}
