class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list  = new ArrayList<>();
        int n = nums.length-k+1;
       for(int i=0;i<=nums.length-k;i++){
        int res = getMax(i,i+k-1,nums);
        list.add(res);
       }

        int arr[] = new int[list.size()];
        for(int p=0;p<list.size();p++){
            arr[p] = list.get(p);
        }

        return arr;
    }

    public int getMax(int s,int e, int arr[]){
       int max = Integer.MIN_VALUE;

        for(int i=s;i<=e;i++){
           max =  Math.max(arr[i],max);
        }
        return max;
    }
}
