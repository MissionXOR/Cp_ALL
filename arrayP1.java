import java.util.*;
public class arrayP1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt(); //user input
        }
        boolean isAscending=true;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
               isAscending=false;
           } 
        }
        if(isAscending){
            System.out.println("this ascending order ");
        }
        else{
            System.out.println("this decending order");
        }
    }
}
