import java.util.*;
public class toggle_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int new_number=n^bitmask;
        System.out.println(new_number);
        sc.close();
    }
    
}
