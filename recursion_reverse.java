import java.util.*;
public class recursion_reverse {
    public static void rev(String s,int ind){
        if(ind==0){
            System.out.println(s.charAt(ind));
            return;
        }
  System.out.println(s.charAt(ind));
  rev(s,ind-1);
}
    public static void main(String[] args) {
        String s="abcd";
        rev(s,s.length()-1);
    }
}
