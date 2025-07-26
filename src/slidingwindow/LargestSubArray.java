package slidingwindow;

public class LargestSubArray {

    public static int largestSubarray(int []nums,int k)
    {
        int l=0;
        int r=0;
        int sum=0;
        int maxLen=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>k) // we can replace with if it is asking for only length
            {
                sum-=nums[l];
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
