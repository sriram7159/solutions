class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l=0;
        int n1 = word1.length();
        int n2 = word2.length();
        while(l<n1 && l<n2){
            sb.append(word1.charAt(l));
            sb.append(word2.charAt(l));
            l++;
        }

        while(l<n1){
            sb.append(word1.charAt(l));
            l++;
        }
        while(l<n2){
            sb.append(word2.charAt(l));
            l++;
        }

        return sb.toString();
    }
}