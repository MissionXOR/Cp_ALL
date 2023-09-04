import java.util.*;
public class Insertion_Sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        //input array
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        //insertion sort 
        for(int i=1;i<arr.length;i++){ 
            //unsorted part 
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                //for sort 
                arr[j+1]=arr[j];
                j--;
            }
            //if loop is false 
            arr[j+1]=temp;
        }
        print(arr); 
    }
 
}
