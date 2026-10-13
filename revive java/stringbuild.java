import java.util.*;
public class stringbuild {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("aryan");
        for(int i=0;i<sb.length()/2;i++ ){
            int front =i;
            int back=sb.length()-i-1;
            char front_char=sb.charAt(front);
            char back_char=sb.charAt(back);

            sb.setCharAt(front, back_char);
            sb.setCharAt(back,front_char);


           
        }
        System.out.println(sb);
        
        
    }
    
}
