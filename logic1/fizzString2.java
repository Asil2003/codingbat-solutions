public class fizzString2 {
    public String fizzString2(int n) {
        boolean divisibleBy3 = (n % 3 == 0);
        boolean divisibleBy5 = (n % 5 == 0);

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz!";
        } else if (divisibleBy3) {
            return "Fizz!";
        } else if (divisibleBy5) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
}
