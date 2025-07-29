public boolean xyBalance(String str) {
  int lastX = -1;
  int lastY = -1;
  
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x') {
      lastX = i;
    } else if (str.charAt(i) == 'y') {
      lastY = i;
    }
  }
  
  return lastX <= lastY;
}
