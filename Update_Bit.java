import java.util.*;
public class Update_Bit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pos=s.nextInt();
        int op=s.nextInt();
        int bitMask=1<<pos;
        //all are decimal form in this practice
        if(op==1){
           int  newNumber=bitMask |n;
            System.out.println(newNumber);
        }else{
            int newBitMask=~(bitMask);
            int newNumber=newBitMask & n;
            System.out.println(newNumber);
            
        }
    }
}
