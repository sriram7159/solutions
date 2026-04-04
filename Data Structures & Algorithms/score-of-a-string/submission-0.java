class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        char[] ch = s.toCharArray();
        for(int i=1;i<ch.length;i++){
            sum = sum + Math.abs(ch[i]-ch[i-1]);
        }

        return sum;
    }
}