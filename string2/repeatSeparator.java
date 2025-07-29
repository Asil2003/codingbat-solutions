public String repeatSeparator(String word, String sep, int count) {
  if (count == 0) return "";

  StringBuilder result = new StringBuilder();

  for (int i = 0; i < count; i++) {
    result.append(word);
    if (i < count - 1) {
      result.append(sep);
    }
  }

  return result.toString();
}
