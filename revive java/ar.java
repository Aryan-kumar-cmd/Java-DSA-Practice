
 abstract class animal{
    abstract void sound();
    void prop(){
        System.out.println("animal park");
    }
}


class dog extends animal{
    void eat(){
        System.out.println("dog eats");
    }
    void sound(){
        System.out.println("barks");
    }
}
    
class cat extends animal{
    void eat(){
        System.out.println("cat eats");
    }
    void sound(){
        System.out.println("meows");
    }

}
    

    
    

    


public class ar {
     public static void main(String[] args) {
        animal b1=new dog();
        animal c1=new cat();

        
        b1.prop();
        b1.sound();
        c1.sound();
        c1.prop();
        
}
}
