class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() > 0) {
            ans = helper(digits);
        }
        return ans;
    }
    public List<String> helper(String digits) {
        String [] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits.length() == 0 || digits == null) {
            List<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        char c = digits.charAt(0);
        String ros = digits.substring(1);
        List<String> fin = new ArrayList<>();
        List<String> recans = helper(ros);
        String codeCh = key[c - '0'];
        
        for(int i = 0; i < codeCh.length(); i++) {
            char ch = codeCh.charAt(i);
            for(String s : recans) {
                fin.add(ch + s);
            }
        }
        return fin;
    }
}