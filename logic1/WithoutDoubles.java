public int withoutDoubles(int dice1, int dice2, boolean noDoubles) {
    if (noDoubles && dice1 == dice2) {
        dice1++;
        if (dice1 > 6) {
            dice1 = 1;
        }
    }
    return dice1 + dice2;
}
