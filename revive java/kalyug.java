import java.util.Scanner;
public class kalyug {

    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        int x=sc.nextInt();
        if(x>15){
            System.out.println("you are adult now");

        }
        else if (x==20) {
            System.out.println("you are mid aged");
            
        }
        else{
            System.out.println("you are minor");
        }
        sc.close();

    }
    
    
}

