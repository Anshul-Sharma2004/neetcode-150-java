class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();        
        for(String start:strs){
            int[] count= new int[26];

            for(int i=0; i<=start.length()-1; i++){
                char getCount= start.charAt(i);
                count[getCount - 'a']++;

            }
                      

            
            StringBuilder sb= new StringBuilder();
            for(int freq: count){
            sb.append('#');
            sb.append(freq);
           }

        String keys= sb.toString();
        if(!map.containsKey(keys)){
            map.put(keys, new ArrayList<String>());
        }  
         map.get(keys).add(start);

        }

        return new ArrayList<>(map.values());

        
    }
}
