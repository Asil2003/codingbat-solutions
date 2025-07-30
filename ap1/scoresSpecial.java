public int scoresSpecial(int[] a, int[] b) {
    int maxA = maxMultipleOf10(a);
    int maxB = maxMultipleOf10(b);
    return maxA + maxB;
}

private int maxMultipleOf10(int[] scores) {
    int max = 0;
    for (int score : scores) {
        if (score % 10 == 0 && score > max) {
            max = score;
        }
    }
    return max;
}
