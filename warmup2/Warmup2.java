public class Warmup2 {
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
    


    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));  // → "HiHi"
        System.out.println(stringTimes("Hi", 3));  // → "HiHiHi"
        System.out.println(stringTimes("Hi", 1));  // → "Hi"
    }
}


public static String frontTimes(String str, int n) {
    String front = str.length() < 3 ? str : str.substring(0, 3);
    String result = "";
    for (int i = 0; i < n; i++) {
        result += front;
    }
    return result;
}
