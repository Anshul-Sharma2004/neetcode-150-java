class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftSuffix=1;
        int rightPrefix=1;
        int n= nums.length-1;
        int[] prefix= new int[nums.length];
        int[] suffix = new int[nums.length];        
        int[] resultStore= new int[nums.length];

        for(int i=0; i<=n; i++){
            prefix[i]= rightPrefix;
            rightPrefix = rightPrefix * nums[i];
        }

        for(int j=n; j>=0; j--){
            suffix[j]= leftSuffix;
            leftSuffix= leftSuffix * nums[j];
        }
        
        for(int k=0; k<=n; k++){
            resultStore[k]= prefix[k] * suffix[k];
        }

        return resultStore;  
    }
}  
