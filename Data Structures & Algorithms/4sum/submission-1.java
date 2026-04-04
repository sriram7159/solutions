class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int m=k+1;m<n;m++){
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