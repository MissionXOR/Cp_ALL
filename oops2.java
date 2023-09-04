//staric means a common think
/*we can access static methods and static variables by using static class
do not need any objects*/
/*every student school name is same..so the name of
school will print in same for every students*/
class student{
    String name;
    static String school;
    public static void changeSchool(){
        school="new school";
    }
}
public class oops2 {
    public static void main(String[] args) {
        student.school="BUBT";
        student s=new student();
       // s.changeSchool();
        s.name="aminul";
        System.out.println(s.school+"  " + s.name);
    }
 
}
