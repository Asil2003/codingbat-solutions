public class notReplace {
    public static String notReplace(String str) {
        return str.replaceAll("\\bis\\b", "is not");
    }

    public static void main(String[] args) {
        System.out.println(notReplace("is test"));         // "is not test"
        System.out.println(notReplace("is-is"));           // "is not-is not"
        System.out.println(notReplace("This is right"));   // "This is not right"
        System.out.println(notReplace("Dis is bliss."));   // "Dis is not bliss."
    }
}
