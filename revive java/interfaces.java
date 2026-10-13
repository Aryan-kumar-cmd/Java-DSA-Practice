interface car{
    void sound();

}
class supra implements car{
    public void sound(){
        System.out.println("ratatatata!!!!!!!");
    }
    
}
class dogecharger implements car{
        public void sound(){
            System.out.println("jummmmmmm!!!!!!!!");
        }
    }
public class interfaces {
    public static void main(String[] args) {
        supra s=new supra();
        dogecharger d=new dogecharger();

        s.sound();
        d.sound();
    }
    
}
