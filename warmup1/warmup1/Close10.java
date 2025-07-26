public class Close10 {
    public static int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);
        if (diffA < diffB) return a;
        else if (diffB < diffA) return b;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(close10(8, 13));  
        System.out.println(close10(13, 8));  
        System.out.println(close10(13, 7));  
    }
}
