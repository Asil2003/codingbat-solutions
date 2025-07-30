public int maxMirror(int[] nums) {
  int max = 0;

  for (int i = 0; i < nums.length; i++) {
    for (int j = nums.length - 1; j >= 0; j--) {
      int count = 0;
      int i1 = i;
      int j1 = j;

      while (i1 < nums.length && j1 >= 0 && nums[i1] == nums[j1]) {
        count++;
        i1++;
        j1--;
      }

      if (count > max) {
        max = count;
      }
    }
  }

  return max;
}
