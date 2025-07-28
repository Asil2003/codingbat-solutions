public boolean catDog(String str) {
    int countCat = 0;
    int countDog = 0;
    for (int i = 0; i < str.length() - 2; i++) {
        String sub = str.substring(i, i + 3);
        if (sub.equals("cat")) {
            countCat++;
        } else if (sub.equals("dog")) {
            countDog++;
        }
    }
    return countCat == countDog;
}
