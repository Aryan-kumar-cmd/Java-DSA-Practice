import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        boolean isascending=true;
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
           
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                 
                isascending=false;
                
            }
           

            }
             if(isascending){
                System.out.println("array is sorted");
            }
            else{
                System.out.println("array is not sorted");
            }
            sc.close();
        }


    
        
    }
    
    

