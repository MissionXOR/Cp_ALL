import java.util.*;
public class recursion_Factorial {
    public static int printFac(int n){
        if(n==1 || n==0){
            return 1;
        }
        //n(n-1)!
        int fact_nm1=printFac(n-1);
        int fact_n=fact_nm1*n;
       return fact_n;
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=printFac(n);
         System.out.println("factorial is:"+result);
    }
 
}
