public class equalIsNot {
    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                isCount++;
            }
        }

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }

        return isCount == notCount;
    }

    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not")); // false
        System.out.println(equalIsNot("This is notnot")); // true
        System.out.println(equalIsNot("noisxxnotyynotxisi")); // true
    }
}
