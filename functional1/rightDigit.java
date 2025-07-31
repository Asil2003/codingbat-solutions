import java.util.*;
import java.util.stream.*;

public class rightDigit {
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                   .map(n -> n % 10)
                   .collect(Collectors.toList());
    }
}
