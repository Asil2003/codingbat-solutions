public List wordsWithoutList(String[] words, int len) {
    List<String> result = new ArrayList<String>();
    for (String word : words) {
        if (word.length() != len) {
            result.add(word);
        }
    }
    return result;
}
