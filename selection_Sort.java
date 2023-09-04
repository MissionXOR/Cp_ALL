/*
           --find the smallest element and take it in the first position
           --use loop to compare the element and at last one swap
           --1 swap per 1 iteration 
           --TC 0(n^2)
 */
import java.util.*;
public class selection_Sort {
    static void printSorting(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        //outer loop
         for(int i=0; i<arr.length-1; i++) {
           int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[smallest]) {
                   smallest = j;
               }
           }
           //swap
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }
        printSorting(arr);
    }
}
