package bubble_sort;
import java.util.Random;

public class Bubble_Sort {
static long startTime = System.currentTimeMillis();
static void non_optimised(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
static void optimised(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        boolean swapped=false;
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }
        if(swapped==false)
            break;
    }
}
    public static void main(String[] args) {
        int arr[]=new int[100000];
        Random rand=new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rand.nextInt(500)+1;
        }
        System.out.println("Unsorted array is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        non_optimised(arr);
        System.out.println("Sorted array using non optimised technique is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       /* optimised(arr);
        System.out.println("Sorted array using optimised technique is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }*/
        System.out.println("");
        System.out.println("the total time is: ");
 long endTime   = System.currentTimeMillis();
 long totalTime = endTime - startTime;

    System.out.println(totalTime);
       
    } 

}
