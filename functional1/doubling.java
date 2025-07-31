public List<Integer> doubling(List<Integer> nums) {
    return nums.stream()
               .map(n -> n * 2)
               .collect(Collectors.toList());
}
