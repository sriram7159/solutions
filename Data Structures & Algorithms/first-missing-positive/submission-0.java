class Solution {
    public int firstMissingPositive(int[] arr) {
    
    int n = arr.length;
    Map<Integer,Integer> map = new HashMap<>();
    for(int i : arr){
        map.put(i,map.getOrDefault(i,0)+1);
    }

    int smallest = Integer.MAX_VALUE;
    int idx =1;

    while(true){

        if(!map.containsKey(idx)){

            smallest = idx ;
            break;
        }

        idx++;
    }


    return smallest;
        
    }
}