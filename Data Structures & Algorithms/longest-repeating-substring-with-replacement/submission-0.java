class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0, maxFreq=0, left=0;
        int[] countElement =new int[26];

        for(int i=0; i<=s.length()-1; i++){
            char ch= s.charAt(i);
            countElement[ch - 'A']++;

            maxFreq= Math.max(maxFreq, countElement[ch - 'A']);

            if((i - left + 1) - maxFreq > k){
                char leftChr = s.charAt(left);
                countElement[leftChr-'A']--;
                left++;
            }

            maxLen= Math.max(maxLen, i-left+1);
        }

        return maxLen;
        
    }
}
