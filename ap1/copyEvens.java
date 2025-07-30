public int[] copyEvens(int[] nums, int count) {
    int[] result = new int[count];
    int idx = 0;

    for (int i = 0; i < nums.length && idx < count; i++) {
        if (nums[i] % 2 == 0) {
            result[idx] = nums[i];
            idx++;
        }
    }

    return result;
}
