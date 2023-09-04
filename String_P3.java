import java.util.*;
public class String_P3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String mail=s.next();
        String user="";
        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                break;
            }else{
                user+=mail.charAt(i);
            }
        }
        System.out.println(user);
    }
}
