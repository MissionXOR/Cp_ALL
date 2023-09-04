/*
    --two part ..1st part is sorted part and 2nd part is unsorted part
    --assume initial element is sorted
    --compare the element and palce them in right position 
    --IF the compare element is smaller than the sorted part element then the sorted 
      element backword
    --TC 0(n^2)
*/
import java.util.*;
public class insertion_sort {
    
    static void print(int arr[]){
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
        //using this loop for take user input
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        //this loop for traverse the unsorted part
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;  //for sorted part 
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }
        print(arr);
    }
}
