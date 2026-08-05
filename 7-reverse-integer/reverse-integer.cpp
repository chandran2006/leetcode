class Solution {
public:
    int reverse(int num) {
        long long x=num;
        bool neg=false;
        if(x<0){
            neg=true;
            x=-x;
        }
        string s=to_string(x);
        std::reverse(s.begin(),s.end());
        long long ans=stoll(s);
        if(neg){
            ans=-ans;
        }
        if(ans>INT_MAX || ans<INT_MIN) return 0;
        return ans;
    }
};