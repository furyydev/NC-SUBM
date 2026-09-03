class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        if (Arrays.equals(sSort, tSort)) {
            return true;
        } else {
            return false;
        }
    }
}
