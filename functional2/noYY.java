public List<String> noYY(List<String> strings) {
  List<String> result = new ArrayList<>();
        for (String s : strings) {
            String toAdd = s.endsWith("y") ? s : s + "y";

            if (result.size() == 0) {
                result.add(toAdd);
            } else {
                String prev = result.get(result.size() - 1);
                if (!(s.endsWith("y") && prev.equals(s.substring(0, s.length() - 1) + "y"))) {
                    result.add(toAdd);
                }
            }
        }
        return result;
}
