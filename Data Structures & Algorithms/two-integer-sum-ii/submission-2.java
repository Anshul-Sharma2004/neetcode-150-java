class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startingIndex=0;
        int endingIndex= numbers.length-1;
        while(startingIndex < endingIndex){
            int sum=numbers[startingIndex] + numbers[endingIndex];
            if(sum < target){
                startingIndex++;
            }else if(sum > target){
                endingIndex--;
            }else{
                return new int[]{startingIndex + 1, endingIndex +1};
            }
        }

        return new int[]{-1,-1};
        
    }
}
