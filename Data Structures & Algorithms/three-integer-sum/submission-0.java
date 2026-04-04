class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> res = new HashSet<>();
         Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<=n-3;i++){
            for(int j=i+1;j<=n-2;j++){
                for(int k=j+1;k<=n-1;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                       List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                       res.add(temp);
                    }
                }
            }
        }
        return  new ArrayList<>(res);
    }
}
