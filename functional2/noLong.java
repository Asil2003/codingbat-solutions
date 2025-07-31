public List<String> noLong(List<String> strings) {
  return strings.stream()
                      .filter(s -> s.length() < 4)
                      .collect(Collectors.toList());
}
