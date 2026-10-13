import java.util.*;

public class removingduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size: ");
        int size=sc.nextInt();
        int[] number=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();

        }
        LinkedHashSet<Integer> set =new LinkedHashSet<>();
        //linkedhashset is used to delete duplicate numers from an array and arranged in the given order in which it is written(preserving order)
        for(int i=0;i<number.length;i++){
            set.add(number[i]);
        }
        System.out.println(set);
        
        sc.close();
        
    
}
}