class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        
        char ch;
        
        while(columnNumber > 0) {
            ch = (char)((int)'A' + (columnNumber - 1) % 26);
            columnNumber = (columnNumber - 1) / 26;
            result = ch + result;
        }
        return result;
    }
}