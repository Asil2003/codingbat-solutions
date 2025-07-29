public String repeatFront(String str, int n) {
  StringBuilder result = new StringBuilder();

  for (int i = n; i > 0; i--) {
    result.append(str.substring(0, i));
  }

  return result.toString();
}
