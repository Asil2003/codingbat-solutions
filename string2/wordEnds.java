public String wordEnds(String str, String word) {
    StringBuilder result = new StringBuilder();
    int len = word.length();

    for (int i = 0; i <= str.length() - len; i++) {
        if (str.substring(i, i + len).equals(word)) {
            if (i > 0) {
                result.append(str.charAt(i - 1));
            }
            if (i + len < str.length()) {
                result.append(str.charAt(i + len));
            }
        }
    }
    return result.toString();
}
