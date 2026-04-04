class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        Arrays.sort(strs);
        int n = strs.length;

        char[] ch1 = strs[0].toCharArray();
        char[] ch2 = strs[n-1].toCharArray();

        for(int i=0;i<strs[0].length();i++){
            if(ch1[i]==ch2[i]){
                str.append(ch1[i]);
            }
            else{
                break;
            }
        }

        return str.toString();

    }
}