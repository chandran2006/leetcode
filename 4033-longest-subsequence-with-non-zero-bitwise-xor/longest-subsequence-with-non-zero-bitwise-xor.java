class Solution {
    public int longestSubsequence(int[] nums) {
        int total=0,n=nums.length;
        boolean nonzero=false;
        for(int x : nums){
            nonzero |= x>0;
            total ^= x;
        }
        if(!nonzero) return 0;
        return total==0 ? n-1: n;
    }
}