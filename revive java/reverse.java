import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int reverse=0;
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
             num=num/10;

            

        }
        System.out.println("the reverse of a number is "+reverse);
        sc.close();
 
        
    }
    
}
