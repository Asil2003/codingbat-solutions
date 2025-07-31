public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                   .map(n -> n * n)
                   .collect(Collectors.toList());
    }