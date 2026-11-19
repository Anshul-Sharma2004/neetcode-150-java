class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftSuffix=1;
        int rightPrefix=1;
        int n= nums.length-1;
        int[] prefix= new int[nums.length];
        int[] suffix= new int[nums.length];
        int[] ans= new int[nums.length];
        for(int i=0; i<=n; i++){
            prefix[i] = rightPrefix;
            rightPrefix= rightPrefix * nums[i]; 
        }

        for(int i=n; i>=0; i--){
            suffix[i] = leftSuffix;
            leftSuffix= leftSuffix * nums[i]; 
        }
        
        for(int i=0; i<=n; i++){
            ans[i]=prefix[i] * suffix[i];
        }

        return ans;
    }
}  
