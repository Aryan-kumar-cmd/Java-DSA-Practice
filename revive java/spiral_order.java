import java.util.*;
public class spiral_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("set the order of the matrix: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print( matrix[i][j]  + " ");
            }
            System.out.println(" ");
        }
        int rowst=0;
        int rowend=n-1;
        int colst=0;
        int colend=m-1;
        System.out.println("spiral elements are");
        while (rowst<=rowend && colst<=colend) {
            for(int col=colst;col<=colend;col++){
            System.out.print(matrix[rowst][col] + " ");
        }
        rowst++;
        for(int row=rowst;row<=rowend;row++){
            System.out.print(matrix[row][colend] + " ");
        }
            colend--;
            //from bottom to left
            for(int col=colend;col>=colst;col--){
                System.out.print(matrix[rowend][col] + " ");
            }
            rowend--;
            //from bottom to top
            for(int row=rowend;row>=rowst;row--){
                System.out.print(matrix[row][colst] + " ");
            }
            colst++;
            
        }
         
            sc.close();

            
        }
        //from left to right
        
        
        //from top to bottom
        

           
        
    }
    

