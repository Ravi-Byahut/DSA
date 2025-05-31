public class ConsecutiveOne {
    ConsecutiveOne()
    {

    }
    public int maximumOne(int [] arr)
    {
        int count=0;
        int maxCount=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]==0 || j==arr.length-1)
                    {
                        count=j-i;
                        if(j== arr.length-1)
                        {
                            flag=true;
                            count++;
                        }
                        break;
                    }
                }

                maxCount=Math.max(count,maxCount);
                if(flag)
                {
                    break;
                }

            }

        }
        return maxCount;
    }
}
