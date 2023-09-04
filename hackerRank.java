import java.util.*;
public class hackerRank{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        String str=Integer.toString(n);
        if(n==Integer.parseInt(str)){
            System.out.println("God job");
        }else{
            System.out.println("Worng answer");
        }
    }
 
}
