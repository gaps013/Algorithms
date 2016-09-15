package binarysearch;
public class BinarySearch {
static int search(int arr[],int key,int l,int r)
{
    if(r>=l)
    {
        int mid=l+(r-l)/2;
        if(arr[mid]==key)
            return mid;
        else if(key>arr[mid])
            return search(arr,key,mid+1,r);
        else
            return search(arr,key,l,mid-1);
    }
    return -1;
}
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=40;
        int r=arr.length-1;
        int result=search(arr,key,0,r);
        if(result==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("The index position of key is = "+result);
        }
    }
    
}
