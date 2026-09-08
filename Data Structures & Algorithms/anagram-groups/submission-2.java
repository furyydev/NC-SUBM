class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String a : strs) {
            char[] x = a.toCharArray();
            Arrays.sort(x);
            String key = new String(x);

            if (map.containsKey(key)) {
                map.get(key).add(a);
            } else {
                map.put(key, new ArrayList<>());
                map.get(key).add(a);
            }
        }
        return new ArrayList<>(map.values());
    }
}
