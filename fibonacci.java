import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            System.out.println(b);
            int sum=b;
            b=a+b;
            a=sum;
        }  
    }
}
