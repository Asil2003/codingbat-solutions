public List<String> lower(List<String> strings) {
  return strings.stream()
                      .map(String::toLowerCase)
                      .collect(Collectors.toList());
}
