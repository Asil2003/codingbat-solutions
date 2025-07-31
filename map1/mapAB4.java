public Map<String, String> mapAB4(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
        String aVal = map.get("a");
        map.put("a", "");
        map.put("b", "");
        map.put("c", aVal);
    }
    return map;
}
