class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lastIndex = nums.length;
        int prefixProd = 1;
        int suffixProd = 1;
        int[] resultStore = new int[lastIndex];
        
        for (int i = 0; i <= lastIndex-1; i++) {
            resultStore[i] = prefixProd;
            prefixProd *= nums[i];
        }
       
        for (int j = lastIndex - 1; j >= 0; j--) {
            resultStore[j] *= suffixProd;
            suffixProd *= nums[j];
        }

        return resultStore;
    }
}  
