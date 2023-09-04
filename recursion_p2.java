//print sum of n natural number
import java.util.*;
public class recursion_p2 {
    public static void printSum(int i,int n,int sum){
        //base
        if(i==n){
            sum+=i;
            System.out.println("sum is:"+sum);
            return;
        }
        //step 
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
