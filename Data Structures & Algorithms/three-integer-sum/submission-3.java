class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
         Arrays.sort(arr);
        int n = arr.length;
        for(int k=0;k<=n-3;k++){
            int tar = -arr[k];

            if(k>0){
                if(arr[k]==arr[k-1]){
                    continue;
                }
            }
            int i = k+1;
            int j = n-1;
            while(i<j){
                if(arr[i]+arr[j]<tar){
                    i++;
                }
                else if(arr[i]+arr[j]>tar){
                    j--;
                }
                else{
                    list.add(Arrays.asList(-tar,arr[i],arr[j]));
                    //to avoid the duplicates
                    while(i<j && arr[i]==arr[i+1]){
                        i++;
                    }
                    while(i<j && arr[j]==arr[j-1]){
                        j--;
                    }
                    i++;
                    j--;
                }
            }
        }

        return list;
    }
}
