public class bunnyEars2 {
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 0) {
            // Even bunny: 3 ears
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            // Odd bunny: 2 ears
            return 2 + bunnyEars2(bunnies - 1);
        }
    }
}
