public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] result = new String[n];
    int i = 0, j = 0, k = 0;

    while (k < n) {
        if (i < a.length && (j >= b.length || a[i].compareTo(b[j]) < 0)) {
            if (k == 0 || !a[i].equals(result[k - 1])) {
                result[k++] = a[i];
            }
            i++;
        } else if (j < b.length) {
            if (k == 0 || !b[j].equals(result[k - 1])) {
                result[k++] = b[j];
            }
            j++;
        }
    }

    return result;
}
