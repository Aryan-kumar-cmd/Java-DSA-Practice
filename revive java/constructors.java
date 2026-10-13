class student{
    int age;
    String name;

    student(int age,String name){
        this.age=age;
        this.name=name;
    }
    void introduce(){
        System.out.println("name is "+name+" age is "+age);
    }
}

public class constructors {
    public static void main(String[] args) {
        student s1=new student(45, "sameer");
        s1.introduce();

        
    }
    
}
