public boolean scoresClump(int[] scores) {
    for (int i = 0; i < scores.length - 2; i++) {
        int a = scores[i];
        int b = scores[i + 1];
        int c = scores[i + 2];
        if (Math.abs(a - c) <= 2 && Math.abs(b - c) <= 2 && Math.abs(a - b) <= 2) {
            return true;
        }
    }
    return false;
}
