public String repeatEnd(String str, int n) {
  String end = str.substring(str.length() - n);
  StringBuilder result = new StringBuilder();

  for (int i = 0; i < n; i++) {
    result.append(end);
  }

  return result.toString();
}
