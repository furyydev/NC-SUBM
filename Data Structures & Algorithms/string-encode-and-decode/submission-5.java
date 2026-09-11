class Solution {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = 1;
            while (str.charAt(i + j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,i + j));
            res.add(str.substring(i + j + 1, i + j + 1 + length));
            i = i + j + 1 + length;
        }
        return res;
    }
}
