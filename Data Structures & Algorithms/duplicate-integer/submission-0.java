class Solution {
    public boolean hasDuplicate(int[] nums) {
        int lastIndex=nums.length-1;
        HashSet<Integer> storeSet= new HashSet<>();
        for(int i=0; i<=lastIndex; i++){
            if(storeSet.contains(nums[i])){                
                return true;
            }
            storeSet.add(nums[i]);
        }
        return false;
    }
}