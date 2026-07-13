class Solution {
    public boolean isAlphaNumeric(char c){
        return (c>='a' && c<='z') || (c>='0' && c<='9');
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while(l<r){
            while(l<s.length() && !isAlphaNumeric(s.charAt(l))) l++;
            while(r>=0 && !isAlphaNumeric(s.charAt(r))) r--;
            if(l>=r) break;
            char left = s.charAt(l);
            char right = s.charAt(r);
            System.out.println(left + " " + right);
            if(left != right){ return false;}
            l++;
            r--;
        }
        return true;
    }
}
