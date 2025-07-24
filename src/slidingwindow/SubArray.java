package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    public static void findSubArray()
    {
        int [] arr={1,2,3,4,5};
        List<List<Integer>> list2= new ArrayList<>();
        List<Integer> list1 =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++)
            {
                list1.clear();
                for(int k=i;k<=j;k++)
                {
                    list1.add(arr[k]);
                }
                list2.add(new ArrayList<>(list1));
            }

        }
        System.out.println(list2);
    }

}
