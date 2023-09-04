import java.util.*;
public class recursion_p1 {
    public static void printNum(int n){
        if(n==0){ //base case
            return;
        }
        System.out.println(n); //print 
        printNum(n-1);//recursion 
           }
    public static void main(String[] args) {
        int n=5;
       // int n=1;
        printNum(n);
    }
}
