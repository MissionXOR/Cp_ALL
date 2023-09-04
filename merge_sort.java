/*
    --divide and conqurer method
    --first divide the array (1st part: si,mid && 2nd part: mid+1,ei)
    --conqure(need a empty array to merge the two sorted part)
    --mid=si+(en-si)/2  ........this is for space complexity
    -- TC 0(n^2)
*/
import java.util.*;
public class merge_sort {
    
    static void conqure(int arr[],int si,int mid,int ei)
    {
        int merge[]=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int x=0; //travarse for empty merge array
        while(indx1<=mid && indx2<=ei)
        {
            if(arr[indx1]<=arr[indx2])
            {
                merge[x++]=arr[indx1++];
                //x++; indx1++;
            }else{
                merge[x++]=arr[indx2++];
            }
        }
        //this loop for any extra element after comparing the both sorted array
        while(indx1<=mid)
        {
            merge[x++]=arr[indx1++];
        }
        while(indx2<=ei)
        {
            merge[x++]=arr[indx2++];
        }
        //this loop for copying the merge element in the orginal element
        for(int i=0,j=si;i<merge.length;i++,j++)
        {
            arr[j]=merge[i];
        }
    }
    
    static void divide(int arr[],int si,int ei)
    {
        //base case
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;   
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        divide(arr,0,n-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
