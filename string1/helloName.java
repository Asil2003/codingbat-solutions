public class helloName {
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));    // → Hello Bob!
        System.out.println(helloName("Alice"));  // → Hello Alice!
        System.out.println(helloName("X"));      // → Hello X!
    }
}
