class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int totalIndex= nums.length-1;
        int ans=nums.length;
        int[] storeAns= new int[k];
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<=totalIndex; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq= new PriorityQueue<>(
                (a,b)-> map.get(a) - map.get(b)
        );
        for(int entry: map.keySet()){
            pq.offer(entry);
            if(pq.size() > k ){
                pq.poll();
            }
        }

        for (int i = 0; i <=k-1; i++) {
            storeAns[i]=pq.poll();
        }

        return storeAns;
    
    }
}
