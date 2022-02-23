class Solution {
    public int compress(char[] chars) {
        int n = chars.length, count = 1;
        Stack<Character> charStack = new Stack<>();
        charStack.push(chars[0]);
        String str = "";
        for(int i=1;i<n;i++){
            if(charStack.peek() == chars[i]){
                count++;
            }else{
                str += String.valueOf(charStack.peek());
                if(count != 1) str += count;
                charStack.push(chars[i]);                
                count = 1;                
            }
        }
        str += String.valueOf(charStack.peek());
        if(count != 1) str += count;
        count = 0;
        n = str.length();
        while(count < n){
            chars[count] = str.charAt(count);
            count++;
        }
        return n;
    }
}