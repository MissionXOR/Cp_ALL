import java.util.*;
public class recursion_logn {
    public static int printSum(int x,int n){
        //base case
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        /*for even : x^n=(x^n/2) * (x^n/2)
        for odd : x^n=(x^n/2) * (x^n/2) * x
        */
        //even case
        if(n%2==0){
            return printSum(x,n/2) * printSum(x,n/2);
        }
        //odd case
        else{
             return printSum(x,n/2) * printSum(x,n/2)*x;
        }
          
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
       int sum= printSum(x,n);
        System.out.println("Stack height for Log n: "+ sum);
    }
}
