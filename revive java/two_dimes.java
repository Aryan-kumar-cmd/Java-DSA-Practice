import java.util.*;
public class two_dimes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        System.out.print("enter the element:");
        int element=sc.nextInt();
        int[][] numbers=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
                
                
                }
            }
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    System.out.print(numbers[i][j] + " ");
                   
                    if(numbers[i][j]==element){
                        System.out.println("\nnumber is present in the index [" +i+"]  + ["+j+"]");
                    }
                }
                 System.out.println(" ");
            }
            sc.close();
        }
         
       
        
    }

    

