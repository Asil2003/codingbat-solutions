public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();

  if (a.length() < b.length()) {
    return b.endsWith(a);
  } else {
    return a.endsWith(b);
  }
}
