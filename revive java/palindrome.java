import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        int original=num;
        while (num!=0) {
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;

            
        }
        if(reverse==original){
            System.out.println("the given number is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
    
}
