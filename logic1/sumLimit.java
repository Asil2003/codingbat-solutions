public int sumLimit(int a, int b) {
    int sum = a + b;
    
    int aDigits = String.valueOf(a).length();
    int sumDigits = String.valueOf(sum).length();
    
    return (sumDigits == aDigits) ? sum : a;
}
