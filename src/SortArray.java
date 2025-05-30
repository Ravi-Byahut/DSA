public class SortArray {
    SortArray(){

    }
    public boolean sortArray(int [] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]){
                return false;
        }

        }
        return true;

    }
    public boolean sortRotateArray(int [] arr)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[(i+1)%n])
            {
                count++;
            }
        }
        if(count>1)
        {
            return false;
        }
        return true;
    }

}
