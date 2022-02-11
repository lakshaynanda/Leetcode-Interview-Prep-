class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String path: paths) {
            String[] values = path.split(" "); 
            for(int i = 1; i < values.length; i++) {
                String[] cont = values[i].split("\\(");
                cont[1] = cont[1].replace(")", "");
                List<String> list = map.getOrDefault(cont[1], new ArrayList<String>());
                list.add(values[0] + "/" + cont[0]);
                map.put(cont[1], list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String key: map.keySet()) {
            if (map.get(key).size() > 1) {
                res.add(map.get(key));
            }
        }
        return res;
    }
}