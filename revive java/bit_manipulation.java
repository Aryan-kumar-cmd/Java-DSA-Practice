import java.util.*;

public class bit_manipulation {
    public static void main(String[] args) {
        //Write a program to find if a number is a power of 2 or not.
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        if(n>0 && (n & (n-1))==0){
            System.out.println("yes it is power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }
        sc.close();

    }
}
