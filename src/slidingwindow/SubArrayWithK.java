package slidingwindow;

class SubArrayWithK {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int l=0;
        int count=0;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>k && l<=r)
            {
                sum-=nums[l];
                l++;

            }
            if(sum==k)
            {
                count++;
            }
        }
        return count;

    }
}