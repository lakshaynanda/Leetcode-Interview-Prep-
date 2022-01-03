class Solution {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> list : regions) {
            for(int i = 1; i < list.size(); i++) {
                map.put(list.get(i), list.get(0));
            }
        }
        
        HashSet<String> set = new HashSet<>();
        while(region1 != null) {
            set.add(region1);
            region1 = map.get(region1);
        }
        while(!set.contains(region2)) {
            region2 = map.get(region2);
        }
        return region2;
    }
}