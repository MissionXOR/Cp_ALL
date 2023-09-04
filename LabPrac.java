import java.util.*;
public class LabPrac {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean isOperator=false;
        boolean isNumber=false;
       boolean isKeyword=false;
       /*
                           switch(str){
                case "int" :case "float":
                    isKeyword=true;
                    if(isKeyword==true){
                System.out.println(str+"is a keyword");
                    }           
                  }
*/
        for(int i=0;i<str.length();i++){
            //for operator
            switch(str.charAt(i)){
                case '-' :case'+':case '*':case'/':
                case'(':case')':case '=':case'&':case'<':case'>':
                    isOperator=true;
                    if(isOperator==true){
                System.out.println(str.charAt(i)+"is a operator");
            }
            }
            //for Number
            switch(str.charAt(i)){
                case '0' :case'1':case '2':case'3':
                case'4':case'5':case '6':case'7':case'8':case'9': 
                    isNumber=true;
            if(isNumber==true){
                System.out.println(str.charAt(i)+"is a number");       
            }    
           }
        
        }

    }
}

