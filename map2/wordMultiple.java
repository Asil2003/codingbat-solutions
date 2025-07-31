public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Integer> countMap = new HashMap<>();
    Map<String, Boolean> result = new HashMap<>();

    for (String s : strings) {
        countMap.put(s, countMap.getOrDefault(s, 0) + 1);
    }

    for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
        result.put(entry.getKey(), entry.getValue() >= 2);
    }

    return result;
}
