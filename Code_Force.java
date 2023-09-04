import java.util.*;
public class Code_Force{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            if(a%b==0){
                System.out.println(0);
            }else{
                int j=a/b+1;
                System.out.println(j*b-a);
            }
        }
    }
}