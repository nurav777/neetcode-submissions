class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int length = str.length();
            sb.append(Integer.toString(length));
            sb.append("#");
            sb.append(str);
        }
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        int idx = 0;
        List<String> res = new ArrayList<>();
        while(idx<str.length()-1){
            int length = 0;
            while(str.charAt(idx)!='#'){
                length *= 10;
                length += (str.charAt(idx) - '0');
                idx++;
            }
            idx++;
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(idx,idx+length));
            idx+=length;
            res.add(sb.toString());
        }
        return res;
    }
}
