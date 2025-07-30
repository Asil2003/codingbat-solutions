public class parenBit {
    public String parenBit(String str) {
        if (str.length() == 0) return "";
        if (str.charAt(0) == '(') {
            int end = str.indexOf(')');
            return str.substring(0, end + 1);
        }
        return parenBit(str.substring(1));
    }
}
