class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(ch!='*')
            {
                st.push(ch);
            }
            else if(ch=='*')
            {
                st.pop();
            }
        }
        String ans="";
        if(s.isEmpty())
        {
            return ans;
        }
        while(!st.isEmpty())
        {
            ans=st.pop()+ans;
        }
        return ans;
    }
}