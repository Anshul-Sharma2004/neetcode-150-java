class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0, leftPointer=0, rightPointer=0; 
        Set<Character> set= new HashSet<>();
        while(rightPointer <  s.length()){
            char leftChr= s.charAt(leftPointer);
            char rightChr= s.charAt(rightPointer);

            if(!set.contains(rightChr)){
                set.add(rightChr);
                maxLength= Math.max(maxLength, rightPointer - leftPointer +1);
                rightPointer++;                                
            }else{
                set.remove(leftChr);
                leftPointer++;


            }


        }
        return maxLength;
    }
}
