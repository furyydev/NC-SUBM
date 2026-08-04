class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int re = heights.length - 1;
        

        while (l<re){
            int area = ( re - l ) * Math.min(heights[l], heights[re]);
            res = Math.max(res, area);

            if(heights[l] < heights[re]) l++; else re--;
        }
        return res;
    }
}
