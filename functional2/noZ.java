public List<String> noZ(List<String> strings) {
  return strings.stream()
                      .filter(s -> !s.contains("z"))
                      .collect(Collectors.toList());
}
