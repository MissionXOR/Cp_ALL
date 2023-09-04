import java.io.*;
import java.util.*;

public class hackerrank_String {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if((A.compareTo(B))>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String a=A.substring(0,1).toUpperCase();
        String b=B.substring(0,1).toUpperCase();
        System.out.print(a+A.substring(1) + " "+ b+B.substring(1));
        
    }
}