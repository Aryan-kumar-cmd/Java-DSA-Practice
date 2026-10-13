import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";
        if(a.length()!=b.length()){
            System.out.println("not anagram");
            return;
        }
        char[] am=a.toCharArray();
        char[] bc=b.toCharArray();
        Arrays.sort(am);
        Arrays.sort(bc);
        if(Arrays.equals(am, bc)){
            System.out.println("is anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
    
}
