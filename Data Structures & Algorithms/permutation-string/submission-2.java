class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int length1 = s1.length();
        int length2 = s2.length();

        if (s1.length() > s2.length()) return false;

         char[] ch = s1.toCharArray();
         Arrays.sort(ch);
         String sorted = new String(ch);

         for(int i=0;i<=s2.length()-s1.length();i++){
            if(toCheck(i,i+s1.length()-1,s2,sorted)){
                return true;
            }
         }
         return false;

    }
    public boolean toCheck(int s,int e,String s2,String s1){
        StringBuilder sb = new StringBuilder();
        for(int i=s;i<=e;i++){
            sb.append(s2.charAt(i));
        }

        char[] ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);

        return s1.equals(sorted);

    }
}
