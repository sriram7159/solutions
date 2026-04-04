class Solution {
    public int[] sortArray(int[] arr) {
          Map<Integer,Integer> map = new HashMap<>();
       int min =arr[0];
       int max = arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
        else if(arr[i]<min){
            min = arr[i];
        }
       }


       for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
       int arr1[] = new int[arr.length];
       int idx =0;
       
       for(int i=min;i<=max;i++){

        if(map.containsKey(i)){
            int val = map.get(i);
            while(val>0){
                arr1[idx++] = i;
                val--;
            }
        }
       }

       return arr1;
    }
}