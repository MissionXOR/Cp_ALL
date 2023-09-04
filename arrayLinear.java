import java.util.*;
public class arrayLinear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size: ");
        int size=s.nextInt();
        int num[]=new int [size];
        //this is input array its so importannt
        System.out.println("list the array:");
        for(int i=0;i<size;i++){
            num[i]=s.nextInt();
        }
        System.out.println("enter the check number:");
        int x=s.nextInt();
        for(int i=0;i<num.length;i++){
          if(num[i]==x){
              System.out.println("this is the number & it's index is:"+i);   
          }
          
        }
    }
  
}
