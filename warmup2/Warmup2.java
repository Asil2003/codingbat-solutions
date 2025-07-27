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


public boolean arrayFront9(int[] nums) {
    int end = Math.min(nums.length, 4);
    for (int i = 0; i < end; i++) {
        if (nums[i] == 9) {
            return true;
        }
    }
    return false;
}




public boolean array123(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
        if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
            return true;
        }
    }
    return false;
}



public int stringMatch(String a, String b) {
    int len = Math.min(a.length(), b.length());
    int count = 0;

    for (int i = 0; i < len - 1; i++) {
        String aSub = a.substring(i, i + 2);
        String bSub = b.substring(i, i + 2);
        if (aSub.equals(bSub)) {
            count++;
        }
    }

    return count;
}


public String stringX(String str) {
    if (str.length() <= 2) return str;

    StringBuilder result = new StringBuilder();
    result.append(str.charAt(0)); // keep first character

    for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i) != 'x') {
            result.append(str.charAt(i));
        }
    }

    result.append(str.charAt(str.length() - 1)); // keep last character
    return result.toString();
}


public String altPairs(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i += 4) {
        result.append(str.charAt(i)); 
        if (i + 1 < str.length()) {
            result.append(str.charAt(i + 1)); 
        }
    }

    return result.toString();
}



public String stringYak(String str) {
    StringBuilder result = new StringBuilder();

    int i = 0;
    while (i < str.length()) {
        if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
            i += 3; 
        } else {
            result.append(str.charAt(i));
            i++;
        }
    }

    return result.toString();
}



public int array667(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
            count++;
        }
    }
    return count;
}



public boolean noTriples(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
        if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
            return false;
        }
    }
    return true;
}

public boolean has271(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
        int val = nums[i];
        if (nums[i+1] == val + 5 && Math.abs(nums[i+2] - (val - 1)) <= 2) {
            return true;
        }
    }
    return false;
}

