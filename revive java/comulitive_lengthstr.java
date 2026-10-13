import java.util.*;
public class comulitive_lengthstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] name=new String[n];
        int total_length=0;
        for(int i=0;i<n;i++){
            name[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(name[i].length());
            total_length+=name[i].length();
        }
        System.out.println("total commulitive length if an array is "+ total_length);
        sc.close();
    }
}
