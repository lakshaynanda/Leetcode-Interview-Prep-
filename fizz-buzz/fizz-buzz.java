class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>() {
            {
                put(3, "Fizz");
                put(5, "Buzz");
            }
        };
        for(int num = 1; num <= n; num++) {
            String ans = "";
            for(int key: map.keySet()) {
                if(num % key == 0) {
                    ans += map.get(key);
                }
            }
            if(ans.equals("")) {
                ans += Integer.toString(num);
            }
            result.add(ans);
        }
        return result;
    }
}