class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int nsr[] = getnsr(heights);
        int nsl[] = getnsl(heights);
        for(int i=0;i<heights.length;i++){
            int width = nsr[i]-nsl[i]-1;
            int area = heights[i] * width;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
    
    public int[] getnsr(int h[]){
        int[] nsr = new int[h.length];
        int n = h.length;
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                nsr[i] = n;
            }

            while(!st.isEmpty() && h[st.peek()]>=h[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = st.peek();
            }

            st.push(i);
        }
        return nsr;
    }

    
    public int[] getnsl(int h[]){
        int[] nsl = new int[h.length];
        int n = h.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                nsl[i] = -1;
            }

            while(!st.isEmpty() && h[st.peek()]>=h[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = st.peek();
            }

            st.push(i);
        }
        return nsl;
    }
}
