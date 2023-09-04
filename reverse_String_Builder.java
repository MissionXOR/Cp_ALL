import java.util.*;
public class reverse_String_Builder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length()/2;i++){
            int fornt=i;
            int back=sb.length()-1-i;
            char fchar=sb.charAt(fornt);
            char bchar=sb.charAt(back);
            sb.setCharAt(fornt, bchar);
            sb.setCharAt(back, fchar);
        }
        System.out.println(sb);
    }
}

