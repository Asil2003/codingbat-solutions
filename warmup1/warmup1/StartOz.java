public class StartOz {
    public static String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += 'o';
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += 'z';
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));  
        System.out.println(startOz("bzoo"));        
        System.out.println(startOz("oxx"));         
    }
}
