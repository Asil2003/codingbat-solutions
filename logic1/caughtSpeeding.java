public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int allowance = isBirthday ? 5 : 0;
        if (speed <= 60 + allowance) {
            return 0;
        } else if (speed <= 80 + allowance) {
            return 1;
        } else {
            return 2;
        }
    }
}
