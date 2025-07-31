public String wordAppend(String[] strings) {
    Map<String, Integer> countMap = new HashMap<>();
    StringBuilder result = new StringBuilder();
    
    for (String s : strings) {
        countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        if (countMap.get(s) % 2 == 0) {
            result.append(s);
        }
    }
    return result.toString();
}
