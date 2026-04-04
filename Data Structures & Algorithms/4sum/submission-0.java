class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<=n-4;i++){
            for(int j=i+1;j<=n-3;j++){
                for(int k=j+1;k<=n-2;k++){
                    for(int m=k+1;m<=n-1;m++){
                        if(arr[i]+arr[j]+arr[k]+arr[m]==target){
                            List<Integer> tar = Arrays.asList(arr[i],arr[j],arr[k],arr[m]);
                            set.add(tar);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}