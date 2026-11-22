class Solution {
    public int maxArea(int[] heights) {
        int leftSide=0, rightSide=heights.length-1, maxWater=0;
        while(leftSide < rightSide){
            int distance= rightSide - leftSide;
            int minimum= Math.min(heights[leftSide], heights[rightSide]);
            int mostWater= distance * minimum;
            if(mostWater > maxWater ){
                maxWater=mostWater;
            }

            if(heights[leftSide] < heights[rightSide]){
                leftSide++;
            }else{
                rightSide--;
            }
        }

        return maxWater;
    }
}
