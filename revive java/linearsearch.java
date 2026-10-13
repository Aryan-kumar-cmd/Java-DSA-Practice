import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []numbers=new int[size];

        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("enter the number:  ");
        int n=sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==n){
                System.out.println("the number is present in an array"+numbers[i]);
            }

        }
        sc.close();
            
    }
    
}
