public class makeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int maxBigNeeded = goal / 5;
        int bigUsed = Math.min(maxBigNeeded, big);
        int remainder = goal - (bigUsed * 5);
        if (small >= remainder) {
            return remainder;
        } else {
            return -1;
        }
    }
}
