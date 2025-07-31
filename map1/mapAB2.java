public Map<String, String> mapAB2(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
        if (Objects.equals(map.get("a"), map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
    }
    return map;
}
