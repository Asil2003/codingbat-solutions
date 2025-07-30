public String[] wordsWithout(String[] words, String remove) {
    int count = 0;
    for (String word : words) {
        if (!word.equals(remove)) {
            count++;
        }
    }

    String[] result = new String[count];
    int idx = 0;
    for (String word : words) {
        if (!word.equals(remove)) {
            result[idx] = word;
            idx++;
        }
    }

    return result;
}
