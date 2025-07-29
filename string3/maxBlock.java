public class maxBlock {
    public static int maxBlock(String str) {
        if (str.length() == 0) return 0;

        int max = 1;
        int current = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));        // 2
        System.out.println(maxBlock("abbCCCddBBBxx")); // 3
        System.out.println(maxBlock(""));              // 0
    }
}
