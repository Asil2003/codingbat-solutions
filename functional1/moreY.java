public List<String> moreY(List<String> strings) {
  return strings.stream()
                      .map(s -> "y" + s + "y")
                      .collect(Collectors.toList());
}
