public class EndUp {
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        String front = str.substring(0, str.length() - 3);
        String end = str.substring(str.length() - 3).toUpperCase();
        return front + end;
    }

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));    // HeLLO
        System.out.println(endUp("hi there")); 
        System.out.println(endUp("hi"));       
    }
}
