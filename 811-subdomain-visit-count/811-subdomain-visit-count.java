class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String domain: cpdomains) {
            String[] cpinfo = domain.split("\\s+");
            String[] frags = cpinfo[1].split("\\.");
            
            int count = Integer.valueOf(cpinfo[0]);
            String curr = "";
            for(int i = frags.length -1; i >= 0; i--) {
                curr = frags[i] + (i < frags.length - 1 ? "." : "") + curr;
                map.put(curr, map.getOrDefault(curr, 0) + count);
            }
        }
        
        List<String> ans = new ArrayList();
        for(String dom: map.keySet()) {
            ans.add("" + map.get(dom) + " " + dom);
        }
        return ans;
    }
}