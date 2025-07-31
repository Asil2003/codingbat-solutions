public List<String> noX(List<String> strings) {
  return strings.stream()
                      .map(s -> s.replace("x", ""))
                      .collect(Collectors.toList());
}
