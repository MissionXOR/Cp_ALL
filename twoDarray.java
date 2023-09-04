import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int [][]array=new int[row][col];
        //this is for input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=s.nextInt();
            }
        }
        //present array
        System.out.println("show the array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(array[i][j]+ "  ");
            }
            System.out.println();
        }
        
    }
  
}
