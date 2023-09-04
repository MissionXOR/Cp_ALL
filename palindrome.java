import java.util.*;
public class palindrome {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        for(int i=A.length()-1;i>=0;i--)
        {
            rev = rev+A.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(A))
         System.out.print("Yes");
         else
         System.out.print("No");
        
    }
}
        
    

