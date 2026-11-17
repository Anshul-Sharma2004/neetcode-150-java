class Solution {
    public boolean isAnagram(String s, String t) {
        int firstString= s.length();
        int secondString= t.length();
        int[] anagram= new int[26];

        if(firstString != secondString){
            return false;

        } 

        for(int i=0; i<=firstString-1; i++){
            anagram[s.charAt(i) - 'a']++;
        }

         for(int i=0; i<=secondString-1; i++){
            anagram[t.charAt(i) - 'a']--;
            if(anagram[t.charAt(i) - 'a'] < 0){
                return false;
            }
            
        }
        return true;
    }
}
