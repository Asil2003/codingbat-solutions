public String[] allSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        String firstChar = strings[i].substring(0, 1);
        if (map.containsKey(firstChar)) {
            int prevIndex = map.get(firstChar);
            // Swap current string with the string at prevIndex
            String temp = strings[i];
            strings[i] = strings[prevIndex];
            strings[prevIndex] = temp;
            // Remove the character so no more swaps happen for this char
            map.remove(firstChar);
        } else {
            map.put(firstChar, i);
        }
    }
    return strings;
}
