public String oneTwo(String str) {
  String result = "";
  for (int i = 0; i + 2 < str.length(); i += 3) {
    result += str.substring(i + 1, i + 3) + str.charAt(i);
  }
  return result;
}
