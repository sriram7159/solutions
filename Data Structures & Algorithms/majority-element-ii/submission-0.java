class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int tar = n/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>tar){
                list.add(key);
            }
        }
        return list;
    }
}