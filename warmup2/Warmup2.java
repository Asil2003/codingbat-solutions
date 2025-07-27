public class Warmup2 {
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
    


    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));  // → "HiHi"
        System.out.println(stringTimes("Hi", 3));  // → "HiHiHi"public static int countXX(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.substring(i, i + 2).equals("xx")) {
            count++;
        }
    }
    return count;
}

        System.out.println(stringTimes("Hi", 1));  // → "Hi"
    }
}


public int countXX(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 1; i++) {
    if (str.substring(i, i + 2).equals("xx")) {
      count++;
    }
  }
  return count;
}

public boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i == -1 || i == str.length() - 1) {
        return false;
    }
    return str.charAt(i + 1) == 'x';
}






public String stringBits(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i += 2) {
        result += str.charAt(i);
    }
    return result;
}


public String stringSplosion(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        result += str.substring(0, i + 1);
    }
    return result;
}



public int last2(String str) {
  int count = 0;
    if (str.length() < 2) {
        return 0;
    }
    String last2 = str.substring(str.length() - 2);

    for (int i = 0; i < str.length() - 2; i++) {
        String sub = str.substring(i, i + 2);
        if (sub.equals(last2)) {
            count++;
        }
    }
    return count;
}



public int arrayCount9(int[] nums) {
    int count = 0;
    for (int num : nums) {
        if (num == 9) {
            count++;
        }
    }
    return count;
}


