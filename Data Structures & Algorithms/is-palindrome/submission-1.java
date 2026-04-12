class Solution {
    public boolean isPalindrome(String s) {
        String A = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); 
        StringBuilder s_updated = new StringBuilder(A);
        s = s_updated.reverse().toString();
        if(s.equals(A)){
            return true;
        }
        else{
            return false;
        }
    }
}
