class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        for(int i = 0; i < heights.length - 1; i++){
            for(int j = i + 1; j < heights.length; j++){
                int b = Math.min(heights[i], heights[j]);
                area = area < (b * (j-i)) ? (b * (j-i)) : area;
                // int h = Math.min(heights[i], heights[j]);
                // area = Math.max(area, h * (j - i));
            }
        }
        return area;
    }
}
