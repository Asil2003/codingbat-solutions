public boolean canBalance(int[] nums) {
  int total = 0;

  for (int num : nums) {
    total += num;
  }

  int leftSum = 0;

  for (int i = 0; i < nums.length - 1; i++) {
    leftSum += nums[i];
    if (leftSum == total - leftSum) {
      return true;
    }
  }

  return false;
}
