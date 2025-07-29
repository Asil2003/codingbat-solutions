public class fizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                result[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - start] = "Buzz";
            } else {
                result[i - start] = Integer.toString(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] res = fizzBuzz(1, 16);
        for (String s : res) {
            System.out.print(s + " ");
        }
    }
}
