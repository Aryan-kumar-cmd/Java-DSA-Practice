class Student{
    String name;
    int age;
    void introduction(){
        System.out.println("name is " + name+ " and age is "+age);
    }
}


public class oops {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="rahul";
        s1.age=45;
        s1.introduction();
         s2.name="rohan";
        s2.age=89;
        s2.introduction();
    }
    
}
