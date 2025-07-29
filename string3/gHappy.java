public class gHappy {
    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean hasLeftG = (i > 0 && str.charAt(i - 1) == 'g');
                boolean hasRightG = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
                if (!hasLeftG && !hasRightG) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));     
        System.out.println(gHappy("xxgxx"));      
        System.out.println(gHappy("xxggyygxx"));  
    }
}
