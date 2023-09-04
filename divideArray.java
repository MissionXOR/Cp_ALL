import java.util.*;
public class divideArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int [] divide=new int[size];
        for(int i=0;i<size;i++){
            divide[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(divide));
        int []first=Arrays.copyOfRange(divide,0,divide.length/2);
        int []last=Arrays.copyOfRange(divide,divide.length/2,divide.length);
        System.out.println("first half is:"+Arrays.toString(first));
        System.out.println("second half is:"+Arrays.toString(last));
    
    }
}
