class Solution {
    public int maxDepth(String s) {
        int depth=0,r=0;
        for(char c:s.toCharArray()){
            if(c==')'){
                depth--;
                continue;
            }
            if(c!='(') continue;
            depth++;
            if(depth>r) r=depth;
        }
        return r;
    }
}