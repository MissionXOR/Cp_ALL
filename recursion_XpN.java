import java.util.*;
public class recursion_XpN {
    public static int  printSum(int x,int n){
        if(n==0){
            //n=0=1
            return 1;
         }
        if(x==0){
            //x=0=0
            return 0;
        }
        //x^n=x*x^n-1
        int xpnm=printSum(x,n-1);
        int xp=x*xpnm;
        return xp;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
       int sum= printSum(x,n);
               System.out.println("sum is:"+sum);

    }
}
