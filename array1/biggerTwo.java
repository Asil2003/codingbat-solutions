public int[] biggerTwo(int[] a, int[] b) {
    int sumA = a[0] + a[1];
    int sumB = b[0] + b[1];
    if (sumB > sumA) {
        return b;
    } else {
        return a;
    }
}
