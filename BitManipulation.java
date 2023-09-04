import java.util.*;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pos=s.nextInt();
        int BitMask=1<<pos;
        //get bit 
        if((BitMask & n)==0){
            System.out.println("bit was 0");
        }
        else{
            System.out.println("bit was 1");
        }
        
        //set bit 
        int newNumber;
        newNumber=BitMask | n;
        System.out.println(newNumber);
        
        //clear bit
        int newBitMask=~(BitMask);
        newNumber=newBitMask & n;
        System.out.println(newNumber);
    }
}
