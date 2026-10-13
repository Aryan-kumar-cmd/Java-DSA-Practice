import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size: ");
        int size=sc.nextInt();
        int[] number=new int[size];
        int largest=number[0];
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if (number[i]<largest && number[i]>secondlargest){
                secondlargest=number[i];
            }
          
        }
         System.out.println("the largest element in an array is "+largest);
           System.out.println("the second largest number in a array is "+secondlargest);
           sc.close();
        
    }
    
}
