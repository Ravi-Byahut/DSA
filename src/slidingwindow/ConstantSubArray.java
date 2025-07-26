package slidingwindow;

public class ConstantSubArray {

    public static int maxSum(int[] nums,int k)
    {
        int sum=0;
        int l=0;
        int maxSum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum-=nums[l];
            l++;
            sum+=nums[i];
           maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
