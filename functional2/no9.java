import java.util.*;
import java.util.stream.*;

public class no9 {
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                   .filter(n -> !Integer.toString(n).contains("9"))
                   .collect(Collectors.toList());
    }
}
