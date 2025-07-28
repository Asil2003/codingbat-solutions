public class makeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        int maxBigBricksUsable = goal / 5;
        int bigBricksUsed = Math.min(big, maxBigBricksUsable);
        int remaining = goal - (bigBricksUsed * 5);
        return small >= remaining;
    }
}
