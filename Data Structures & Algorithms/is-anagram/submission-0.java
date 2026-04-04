class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = method(s) ;
        String s2 = method(t);

        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }



    }

    public String method(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        return sorted;
    }
}
