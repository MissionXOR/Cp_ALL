/*
         --works repeatdly swapping
         --traverse from left and compare the elements and
           heigher one is placed at the right 
         --TC 0(n^2)
         --first loop using for travarse the elements 
         --second loop using for iteration to take 
           the large element at correct position
*/
import java.util.*;
public class bubble_sort {
    
    static public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
               //swap 
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }        
        }
        printArray(arr);
    }
}
