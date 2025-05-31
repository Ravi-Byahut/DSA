import  java.util.*;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
           Scanner sc=new Scanner(System.in);
           int n= sc.nextInt();
           int []arr=new int[n];
           for(int i=0;i<n;i++)
           {
               arr[i]=sc.nextInt();
           }
           SortArray obj=new SortArray();
           ConsecutiveOne obj2=new ConsecutiveOne();
        System.out.println(obj2.maximumOne(arr));

    }
}