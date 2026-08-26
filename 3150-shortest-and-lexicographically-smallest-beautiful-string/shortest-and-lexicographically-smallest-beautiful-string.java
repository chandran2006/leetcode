class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        int n=s.length();
        for(int i=0;i<n;i++){
            int onecnt=0;
            StringBuilder cur=new StringBuilder();
            for(int j=i;j<n;j++){
                cur.append(s.charAt(j));
                if(s.charAt(j)=='1') onecnt++;
                if(onecnt>k) break;
                if(onecnt==k){
                    String curstr=cur.toString();
                    if(ans.isEmpty() || curstr.length()<ans.length() || (curstr.length()==ans.length() && curstr.compareTo(ans)<0)){
                        ans=curstr;
                    }
                }
            }
        }
        return ans;
    }
}