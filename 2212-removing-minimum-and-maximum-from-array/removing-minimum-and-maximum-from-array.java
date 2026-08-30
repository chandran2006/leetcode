class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int l=0,r=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[l]) l=i;
            if(nums[i]>nums[r]) r=i;
        }
        if(l < r){
            int temp=l;
            l=r;
            r=temp;
        }
        int ans=n;
        for(int i=0;i<=n;i++){
            int extra=0;
            if(r>=i) extra=n-r;
            else if(l>=i) extra=n-l;
            ans=Math.min(ans,i+extra);
        }
        return ans;
    }
}