import java.util.*;
public class String_p2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String result="";
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='e' ||str.charAt(i)=='E'){
               result+='i';
           } else{
               result+=str.charAt(i);
           }
        }
        System.out.println(result);
    }
}
