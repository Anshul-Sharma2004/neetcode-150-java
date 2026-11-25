class Solution {
    public boolean checkInclusion(String s1, String s2) {
          int left=0;
        int[] storeCount= new int[26]; 
        int[] storeCountS2= new int[26]; 
        if(s1.length() > s2.length()) return false;

        for(int i=0; i<=s1.length()-1; i++){
            storeCount[s1.charAt(i)-'a']++;
        }

        for(int right=0; right<= s2.length()-1; right++){
            storeCountS2[s2.charAt(right) - 'a']++;
            if(right-left + 1 > s1.length()){
                storeCountS2[s2.charAt(left)-'a']--;
                left++;
            }

            if(right-left + 1 == s1.length()){
                
                if(Arrays.equals(storeCount, storeCountS2)){
                    return true;
                }
               
                
            }
            
        }

        return false;       
    }
}
