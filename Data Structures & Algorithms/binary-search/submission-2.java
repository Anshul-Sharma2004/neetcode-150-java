class Solution {
    public int search(int[] nums, int target) {
        int startingIndex=0;
        int endingIndex=nums.length-1;
        while(startingIndex <= endingIndex){
            int mid = startingIndex + (endingIndex - startingIndex) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){                                
                startingIndex=mid+1;                
            }else{
                endingIndex=mid-1;
            }         

        }

        return -1;
        
    }
}
