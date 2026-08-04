class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        int maxsum=sum;
        int left=0;
        for(int right=k;right<nums.length;right++)
        {
            sum+=nums[right];
            sum-=nums[left];
            left++;
            maxsum=Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }
}