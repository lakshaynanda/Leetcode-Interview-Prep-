class TimeMap {
    class Values {
        String val;
        int time;
        public Values (String val, int time) {
            this.val = val;
            this.time = time;
        }
    }
    HashMap<String, List<Values>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Values(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        List<Values> vals = map.get(key);
        
        for(int i = vals.size() - 1; i >= 0; i--) {
            if (timestamp >= vals.get(i).time) {
                return vals.get(i).val;
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */