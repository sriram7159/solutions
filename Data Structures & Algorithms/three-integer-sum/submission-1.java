class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for(int k=0;k<=n-3;k++){
            int target = -arr[k];
            if(k>0){
                if(arr[k]==arr[k-1]){
                    continue;
                }
            }
            int i = k+1;
            int j = n-1;
            while(i<j){
                if(arr[i]+arr[j]<target){
                    i++;
                }
                else if(arr[i]+arr[j]>target){
                    j--;
                }
                else{
                    list.add(Arrays.asList(-target,arr[i],arr[j]));
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
