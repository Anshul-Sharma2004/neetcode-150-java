class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indexValue= nums.length-1;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<=indexValue; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        
        return new int[]{-1,-1};

    }
}
