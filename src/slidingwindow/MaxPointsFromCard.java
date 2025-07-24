package slidingwindow;

class MaxPointsFromCard {
    public int maxScore(int[] cardPoints, int k) {
       int lsum=0;
       int rsum=0;
       int maxSum=0;
       for(int i=0;i<=k-1;i++)
       {
        lsum+=cardPoints[i];
       }
       maxSum=lsum;
       int sum=0;
       int rightIndex=cardPoints.length-1;
       for(int i=k-1;i>=0;i--)
       {
        lsum-=cardPoints[i];
        rsum+=cardPoints[rightIndex];
        sum=lsum+rsum;
        maxSum=Math.max(maxSum,sum);
        rightIndex--;
       }
       return maxSum;
    }
}