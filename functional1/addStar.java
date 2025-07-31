public List<String> addStar(List<String> strings) {
   return strings.stream()
                      .map(s -> s + "*")
                      .collect(Collectors.toList());
}
