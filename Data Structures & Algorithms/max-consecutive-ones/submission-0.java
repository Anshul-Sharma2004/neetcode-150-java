class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int index= nums.length-1;
        int count=0;
        int storeMax=0;

        for(int i=0; i<=index; i++){
                if(nums[i]==1){
                    count++;
                    storeMax=Math.max(storeMax, count);
                }else{
                    count=0;
                    
                }
            }
        

        return storeMax;
    }
}