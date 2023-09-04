import java.util.*;
public class BackTracking {
    public static void back(String str,String per,int indx){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String news=str.substring(0,i)+str.substring(i+1);
            back(news,per+curr,indx+1);
        }
    }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String str=s.next();
     back(str,"",0);
    }
}
