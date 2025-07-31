public String[] firstSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    Set<String> swapped = new HashSet<>();

    for (int i = 0; i < strings.length; i++) {
        String firstChar = strings[i].substring(0, 1);
        if (swapped.contains(firstChar)) {
            continue;  // Already swapped for this char, skip
        }
        if (map.containsKey(firstChar)) {
            int prevIndex = map.get(firstChar);
            String temp = strings[i];
            strings[i] = strings[prevIndex];
            strings[prevIndex] = temp;
            swapped.add(firstChar);  // Mark char as swapped
        } else {
            map.put(firstChar, i);
        }
    }
    return strings;
}
