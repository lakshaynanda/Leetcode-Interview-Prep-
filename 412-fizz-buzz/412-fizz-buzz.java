class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            String ans = "";
            boolean div3 = (i % 3 == 0);
            boolean div5 = (i % 5 == 0);
            
            if (div3) {
                ans += "Fizz";
            }
            if (div5) {
                ans += "Buzz";
            }
            if (ans.equals("")) {
                ans += String.valueOf(i);
            }
            res.add(ans);
        }
        return res;
    }
}