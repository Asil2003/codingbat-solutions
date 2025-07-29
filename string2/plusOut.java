public String plusOut(String str, String word) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < str.length()) {
        if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
            result.append(word);
            i += word.length();
        } else {
            result.append('+');
            i++;
        }
    }
    return result.toString();
}
