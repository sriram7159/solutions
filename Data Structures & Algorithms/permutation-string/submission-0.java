class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int length1 = s1.length();
        int length2 = s2.length();

        if(length1>length2){
            String temp = s1;
            s2 = s1;
            s1 = temp;
        }
        
         char[] ch = s1.toCharArray();
         Arrays.sort(ch);
         String sorted = new String(ch);

         int i =0;
         int j=0;
         int n = length2;
         while(j<n){
            int current_length = j-i+1;
            int desired = length1;
            if(current_length<desired){
                j = j + desired-current_length;
            }

            if(j>n){
                return false;
            }

            boolean res = toCheck(i,j,s2,sorted);
            if(res){
                return true;
            }
            i++;
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
