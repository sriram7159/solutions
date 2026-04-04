class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","");
        s1 = s1.trim();
        s1 = s1.replace(" ","");
        s1 = s1.toLowerCase();
        String s2 =  new StringBuilder(s1).reverse().toString();

        return s1.equals(s2);
    }
}
