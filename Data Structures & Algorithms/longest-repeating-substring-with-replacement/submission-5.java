class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] =  new int[26];
        int i =0;
        int j =0;
        int maxFreq = 0;
        int maxLength = 0;
        int n = s.length();
        while(j<n){
            arr[s.charAt(j)-'A']++;
            while((j-i+1)-getMax(arr)>k){
                arr[s.charAt(i)-'A']--;
                i++;
            }
            maxLength = Math.max(maxLength,(j-i+1));
        }
        return maxLength;
    }

    public int getMax(int arr[]){
        int max = 0;

        for(int i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
}
