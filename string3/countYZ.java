public class countYZ {
    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase(); // ignore case

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')) {
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    // You can test the function using main
    public static void main(String[] args) {
        System.out.println(countYZ("fez day")); // → 2
        System.out.println(countYZ("day fez")); // → 2
        System.out.println(countYZ("day fyyyz")); // → 2
    }
}
