public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        boolean weekend = (day == 0 || day == 6);
        
        if (vacation) {
            return weekend ? "off" : "10:00";
        } else {
            return weekend ? "10:00" : "7:00";
        }
    }
}
