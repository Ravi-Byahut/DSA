import java.util.Arrays;

public class MissingNumber {
    MissingNumber()
    {

    }
    public int missingNumber(int [] arr)
    {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i)
            {
                return i;
            }

        }
        return n;
    }

    public int missingNumber2(int [] arr)
    {
        int n= arr.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum2=sum2+arr[i];
        }
        return sum1-sum2;

    }

}
