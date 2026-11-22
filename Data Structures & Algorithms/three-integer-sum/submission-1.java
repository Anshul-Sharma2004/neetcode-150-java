class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();

        for(int i=0; i<=n; i++){

            if(i>0 && nums[i] ==nums[i-1]) continue;
            int leftSum=i+1 , rightSum=n;
            while(leftSum < rightSum){                
                int sum= nums[i] + nums[leftSum] + nums[rightSum];
                if(sum<0){
                    leftSum++;
                }else if(sum>0){
                    rightSum--;
                }else{
                    list.add(Arrays.asList(nums[i], nums[leftSum], nums[rightSum]));
                    leftSum++;
                    rightSum--;
                    while(leftSum < rightSum && nums[leftSum] == nums[leftSum-1]) leftSum++;

                }

            }           

    }

    return list;

    }

}
