//interfacing show the useful information 
//cannot use constructor in interfacing also cannot use non abstract method
//methods are pulic and abstract
interface animals{
    void walk();
}
interface herbivore{
    
}
class horses implements animals,herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class oops1 {
    public static void main(String[] args) {
        horses h=new horses();
        h.walk();
    }
 
}
