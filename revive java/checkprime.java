import java.util.*;
public class checkprime {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        
        if(isPrime(n)){
            System.out.println("it's a prime number");
        }
        else{
            System.out.println("not a prime number");
        }
        sc.close();
    }
    
}
