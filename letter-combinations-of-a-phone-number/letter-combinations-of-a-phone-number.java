class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() > 0) {
            ans = helper(digits);
        }
        return ans;
    }
    public List<String> helper(String digits) {
        String [] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits == null || digits.length() == 0) {
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        
        char c = digits.charAt(0);
        String ros = digits.substring(1);
        
        ArrayList<String> fin = new ArrayList<>();
        List<String> recans = helper(ros);
        String codeForC = key[c - '0'];
        for(int i = 0; i < codeForC.length(); i++) {
            char ch = codeForC.charAt(i);
            for(String s : recans) {
                fin.add(ch + s);
            }
        }
        return fin;
    }
}