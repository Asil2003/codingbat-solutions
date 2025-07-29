public class no14 {
    public static boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        for (int num : nums) {
            if (num == 1) has1 = true;
            if (num == 4) has4 = true;
        }

        return !(has1 && has4);
    }

    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 2, 3}));       // true
        System.out.println(no14(new int[]{1, 2, 3, 4}));    // false
        System.out.println(no14(new int[]{2, 3, 4}));       // true
    }
}
