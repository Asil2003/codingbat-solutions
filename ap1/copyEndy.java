public int[] copyEndy(int[] nums, int count) {
    int[] result = new int[count];
    int idx = 0;

    for (int num : nums) {
        if (isEndy(num)) {
            result[idx] = num;
            idx++;
            if (idx == count) {
                break;
            }
        }
    }

    return result;
}

private boolean isEndy(int n) {
    return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}
