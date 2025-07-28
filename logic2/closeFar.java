public class closeFar {
    public static boolean closeFar(int a, int b, int c) {
        boolean bClose = Math.abs(a - b) <= 1;
        boolean cClose = Math.abs(a - c) <= 1;
        boolean bFarFromC = Math.abs(b - c) >= 2;

        if (bClose && !cClose && Math.abs(c - a) >= 2 && bFarFromC) return true;
        if (!bClose && cClose && Math.abs(b - a) >= 2 && bFarFromC) return true;

        return false;
    }
}
