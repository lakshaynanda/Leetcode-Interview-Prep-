class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            boolean divby3 = (i % 3 == 0);
            boolean divby5 = (i % 5 == 0);
            
            String ans = "";
            
            if(divby3) {
                ans += "Fizz";
            }
            if(divby5) {
                ans += "Buzz";
            }
            if(ans.equals("")) {
                ans += Integer.valueOf(i);
            }
            res.add(ans);
        }
        return res;
    }
}