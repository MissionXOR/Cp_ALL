import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
