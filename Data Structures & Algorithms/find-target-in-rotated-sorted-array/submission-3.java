class Solution {
    public int search(int[] nums, int target) {
        int leftSide=0, rightSide=nums.length-1, index=rightSide-1;

        while(leftSide <= rightSide){
            int mid= leftSide + (rightSide - leftSide) /2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[leftSide] <= nums[mid]){
                if(nums[leftSide] <= target && target <=nums[mid]){
                    rightSide = mid-1;
                }else{
                    leftSide = mid +1;
                }
            }else if(nums[mid] <= nums[rightSide]){
                if(nums[mid] <= target && target <= nums[rightSide]){
                    leftSide = mid+1;
                }else{
                    rightSide=mid-1;
                }
            }     
        } 

        return -1;        
    }
}
