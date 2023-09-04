import java.util.*;
public class BubbleSort {
    static public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        //input array
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        //bubble sort 
        for(int i=0;i<arr.length-1;i++){   //comparison
            for(int j=0;j<arr.length-i-1;j++){   //iteration
                if(arr[j]>arr[j+1]){
                    //swaping 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
