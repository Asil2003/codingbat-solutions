public class Max1020 {
    public static int max1020(int a, int b) {
        boolean aInRange = a >= 10 && a <= 20;
        boolean bInRange = b >= 10 && b <= 20;
        
        if (aInRange && bInRange) {
            return (a > b) ? a : b;
        } else if (aInRange) {
            return a;
        } else if (bInRange) {
            return b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(max1020(11, 19));  
        System.out.println(max1020(19, 11));  
        System.out.println(max1020(11, 9));   
        System.out.println(max1020(9, 21));   
    }
}
