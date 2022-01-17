class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length + 1];
        List<Integer> result = new ArrayList<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int key : map.keySet()) {
            if (list[map.get(key)] == null) {
                list[map.get(key)] = new ArrayList<>();
            }
            list[map.get(key)].add(key); 
        }
        for(int i = list.length - 1; i >= 0 && result.size() < k; i--) {
            if (list[i] != null) {
                result.addAll(list[i]);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}