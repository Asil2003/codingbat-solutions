public int userCompare(String aName, int aId, String bName, int bId) {
    int nameCompare = aName.compareTo(bName);
    if (nameCompare < 0) return -1;
    if (nameCompare > 0) return 1;
    // names equal, compare IDs
    return Integer.compare(aId, bId);
}
