public class Front22 {
    public static String front22(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + str + front;
    }

    public static void main(String[] args) {
        System.out.println(front22("kitten"));  
        System.out.println(front22("Ha"));      
        System.out.println(front22("abc"));     
        System.out.println(front22("H"));       
        System.out.println(front22(""));       
    }
}
