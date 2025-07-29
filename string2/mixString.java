public String mixString(String a, String b) {
  StringBuilder result = new StringBuilder();
  int minLen = Math.min(a.length(), b.length());

  for (int i = 0; i < minLen; i++) {
    result.append(a.charAt(i));
    result.append(b.charAt(i));
  }

  // Append remaining characters (if any)
  if (a.length() > b.length()) {
    result.append(a.substring(minLen));
  } else if (b.length() > a.length()) {
    result.append(b.substring(minLen));
  }

  return result.toString();
}
