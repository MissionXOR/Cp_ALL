import java.util.*;
//abastrction ---> 1.abstract 2.interfacing 
//important information show the user and non-impotant information hide the user 
abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("create animal constructor");
    }
    public void eat(){
        System.out.println("animal can eat");
    }
}
class horse extends animal{
    horse(){
        System.out.println("horse constructor");
    }
    public void walk(){
        System.out.println("horse walk");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("chicken walk");
    }
}
public class oops {
    public static void main(String[] args) {
        horse h=new horse();
        //chicken c=new chicken();
      //  h.eat();
      // h.walk();
       // c.walk();
    }
}
