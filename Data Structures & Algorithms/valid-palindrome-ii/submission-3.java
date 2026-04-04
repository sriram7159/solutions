class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        int count = 0;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else if(s.charAt(l)!=s.charAt(r) && s.charAt(l)!=s.charAt(r-1)){
                return false;
            }
            else if(s.charAt(l+1)!=s.charAt(r)){
                return false;
            }
        }
        return true;
    }
}