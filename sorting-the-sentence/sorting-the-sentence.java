class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String fin[] = new String[arr.length];
        
        for(String str : arr) {
            int pos = str.charAt(str.length() - 1) - '0' - 1;
            fin[pos] = str.substring(0, str.length() - 1);
        }
        return String.join(" ", fin);
    }
}