import java.util.*;
public class h$mt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        int[] number=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int max=number[0];
        int min=number[0];
        for(int i=0;i<number.length;i++){
            if(max<number[i]){
                max=number[i];
            }
            if(number[i]<min){
                min=number[i];

            }
           

        }
         System.out.println("the maxium element in an array is "+max);
         System.out.println("the minimum element in an array is "+min);
        sc.close();

    }
    
}
